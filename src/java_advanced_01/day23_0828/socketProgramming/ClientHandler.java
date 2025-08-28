package java_advanced_01.day23_0828.socketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

// Runnable 인터페이스를 구현하여 스레드풀의 작업 단위로 만듭니다.
public class ClientHandler implements Runnable {
    private final Socket clientSocket;
    private String nickname;
    private PrintWriter out;

    // 클라이언트 소켓을 생성자의 인자로 받습니다.
    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
    }

    @Override
    public void run() {
        // 이 메서드 안에 클라이언트와 실제 통신할 로직을 구현합니다.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), StandardCharsets.UTF_8));) {
            this.out = new PrintWriter(clientSocket.getOutputStream(), true, StandardCharsets.UTF_8);

            // 닉네임 등록
            while (true) {
                out.println("NICK <이름>");
                String message = br.readLine();
                if (message == null || !message.startsWith("NICK ")) {
                    continue;
                }

                String proposedNickname = message.substring(5).trim();
                // 공백/중복 닉네임 거절
                if (proposedNickname.isEmpty() || Server.isNicknameInUse(proposedNickname)) {
                    out.println("사용 중이거나 유호하지 않은 닉네임");
                    continue;
                }

                this.nickname = proposedNickname;
                Server.addClient(this.nickname, this);
                System.out.println("[Server] " + nickname + "joined");
                Server.broadcastMessage(nickname + "님이 채팅방 입장.");
                break;
            }

            // 메인 통신
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("/")) {
                    handleCommand(line);
                } else {
                    Server.broadcastMessage("[" + nickname + "]" + line);
                }
            }

        } catch (IOException e) {
            System.err.println("[ClientHandler] 통신 중 오류 발생: " + e.getMessage());
        } finally {
            // 연결 종료 작업
            if (nickname != null) {
                Server.removeClient(this.nickname);
                Server.broadcastMessage(nickname + " left");
                System.out.println("[Server]" + nickname + " left");
            }
            try {
                if (clientSocket != null) clientSocket.close();
            } catch (IOException e) {
                System.out.println("[ClientHandler] 소켓 닫기 오류: " + e.getMessage());
            }
        }
    }

    private void handleCommand(String command) {
        if ("/quit".equalsIgnoreCase(command)) {
            try {
                clientSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if ("/who".equalsIgnoreCase(command)) {
            String users = String.join(", ", Server.getConnectedUsers());
            sendMessage("현재 접속자: " + users);
        } else {
            sendMessage("알 수 없는 명령어");
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

}
