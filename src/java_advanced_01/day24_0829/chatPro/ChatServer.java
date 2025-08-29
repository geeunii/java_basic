package java_advanced_01.day24_0829.chatPro;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 채팅방의 관리자입니다. 서버 프로그램을 실행하는 메인 클래스로,
// 클라이언트의 연결 요청을 받아 SocketClient 에 연결
public class ChatServer {
    public static final int PORT = 50001;  // 포트 번호 50001
    public static ServerSocket serverSocket; // 서버 소켓. 클라이언트의 요청을 받기 위한 메인 소켓
    public static ExecutorService executorService = Executors.newFixedThreadPool(100);   // 스레드풀. 클라이언트 처리를 위해 스래드들을 관리
    public static Map<String, SocketClient> chatRoom = new ConcurrentHashMap<>();   // 통신용 클라이언트 관리하는 Map

    public static void main(String[] args) {


        serverStart();
    }

    public static void serverStart() {  // 서버 시작
        try {
            serverSocket = new ServerSocket(PORT);  // 서버 소켓 생성 및 포트 바인딩
            System.out.println("Server Started");

            Thread thread = new Thread(() -> {
                try {
                    while (!serverSocket.isClosed()) {  // 람다식이 하는 일을 개발자가 지정
                        Socket socket = serverSocket.accept();  // 연결 수락
                        SocketClient client = new SocketClient(); // 통신용 SocketClient 를 반복해서 생성
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            });
            thread.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 클라이언트 연결시 SocketClient 생성 하고 Map에 추가 하는 기능 메소드


    // 클라이언트가 연결 종료 시 SocketClient chatRoom 에서 제거 메소드

}
