package java_advanced_01.day23_0828.socketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

// 채팅방에 접속하는 사용자 애플리케이션의 역할을 합니다.
// 사용자의 키보드 입력을 서버로 보내고, 서버로부터의 메시지를 화면에 출력합니다.
public class Client {

    public static void main(String[] args) {
        // --- 1. 명령줄 인자(argument) 유효성 검사 ---
        // 프로그램 실행 시 필요한 3가지 인자(IP, 포트, 닉네임)가 모두 입력되었는지 확인합니다.
        if (args.length != 3) {
            System.out.println("사용법: java Client <서버IP> <포트> <닉네임>");
            return; // 인자가 부족하면 사용법을 출력하고 프로그램 종료
        }

        // 인자를 변수에 저장합니다.
        String serverIp = args[0];
        int port = Integer.parseInt(args[1]);
        String nickname = args[2];

        // --- 2. 자원 초기화 및 서버 연결 ---
        // try-with-resources: 이 블록을 벗어나면 선언된 자원들(소켓, 스트림 등)이 자동으로 닫힙니다.
        try (
                Socket socket = new Socket(serverIp, port); // 서버와 연결하는 소켓을 생성 (네트워크 통로)
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8)); // 서버로부터 메시지를 읽기 위한 스트림
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true, StandardCharsets.UTF_8); // 서버로 메시지를 보내기 위한 스트림
                Scanner scanner = new Scanner(System.in) // 사용자의 키보드 입력을 읽기 위한 객체
        ) {
            System.out.println("서버에 연결되었습니다. 닉네임 등록을 진행합니다.");

            // --- 3. 메시지 수신 스레드 시작 (동시 작업) ---
            // 키보드 입력과 서버 메시지 수신은 동시에 이루어져야 합니다.
            // 따라서 서버 메시지를 받는 작업은 별도의 스레드에 맡깁니다.
            Thread readerThread = getThread(in);

            // --- 4. 닉네임 등록 로직 ---
            // 서버에 먼저 닉네임 등록 메시지를 보냅니다.
            out.println("NICK " + nickname);

            // --- 5. 사용자 입력 및 전송 루프 ---
            // 메인 스레드는 사용자의 키보드 입력을 계속 읽고 서버로 전송하는 역할만 합니다.
            String userMessage;
            while (true) {
                userMessage = scanner.nextLine(); // 키보드로부터 한 줄을 읽음
                if ("/quit".equalsIgnoreCase(userMessage)) {
                    out.println(userMessage); // 서버에 종료 알림
                    break; // 루프를 빠져나와 프로그램 종료 절차 시작
                }
                out.println(userMessage); // 사용자가 입력한 메시지를 서버로 전송
            }

            System.out.println("채팅을 종료합니다.");
            // 리더 스레드를 종료하기 위해 인터럽트 신호를 보냅니다.
            readerThread.interrupt();

        } catch (IOException e) {
            // 서버 연결 실패 또는 통신 초기 단계의 오류를 처리합니다.
            System.err.println("서버 연결 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

    private static Thread getThread(BufferedReader in) {
        Thread readerThread = new Thread(() -> {
            try {
                String serverMessage;
                // 서버가 보낸 메시지를 한 줄씩 읽어와 화면에 출력합니다.
                while ((serverMessage = in.readLine()) != null) {
                    System.out.println(serverMessage);
                }
            } catch (IOException e) {
                // 서버가 연결을 끊으면 발생하는 예외 (정상적인 종료 신호)
                System.err.println("서버 연결이 끊어졌습니다.");
            }
        });
        readerThread.start(); // 스레드 시작
        return readerThread;
    }
}