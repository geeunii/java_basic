package java_advanced_01.day23_0828.socketProgramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static final int PORT = 5000;
    public static ServerSocket serverSocket = null;
    public static ExecutorService executorService = null;

    // 스레드 맵으로 클라이언트 정보 관리 - 안전
    private static final Map<String, ClientHandler> clients = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        // Shutdown Hook 등록 -> Ctrl + C 처리
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("\n[Server] 종료 전 정리 중");
            // 서버 소켓 닫기
            if (serverSocket != null && !serverSocket.isClosed()) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    System.out.println("[Server] 소켓 닫기 오류 " + e.getMessage());
                }
            }
            if (executorService != null) {
                executorService.shutdown();
            }
            System.out.println("[Server] 종료 완료");
        }));

        serverStart();
    }

    public static void serverStart() {
        try {
            serverSocket = new ServerSocket(PORT);  // 클래스 변수에 할당

            executorService = Executors.newCachedThreadPool(); // 스레드 수 제한 X
            System.out.println("[Server] Start. PORT " + PORT + "번 대기 중");

            while (!serverSocket.isClosed()) {
                System.out.println("[Server] 연결 요청 대기");
                Socket socket = serverSocket.accept();
                System.out.println("[Server] 연결 수락: " + socket.getRemoteSocketAddress());

                executorService.submit(new ClientHandler(socket));
            }
        } catch (IOException e) {
            System.out.println("[Server] 소켓 생성 오류: " + e.getMessage());
        }
    }

    public static void addClient(String nickname, ClientHandler handler) {
        clients.put(nickname, handler);
    }

    public static void removeClient(String nickname) {
        clients.remove(nickname);
    }

    public static boolean isNicknameInUse(String nickname) {
        return clients.containsKey(nickname);
    }

    public static Set<String> getConnectedUsers() {
        return Collections.unmodifiableSet(clients.keySet());
    }

    public static void broadcastMessage(String message) {
        for (ClientHandler client : clients.values()) {
            client.sendMessage(message);
        }
    }

}
