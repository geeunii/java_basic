package java_advanced_01.day22_0827.socket01;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class ServerSocketEx01 {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {
        System.out.println("--------------Starting Server Socket-------------");
        System.out.println("서버를 종료하려면 q 또는 Q 를 입력하고 Enter 키를 입력하시오.");
        System.out.println("-------------------------------------------------");

        // TCP 서버 시작
        startServer();

        // 키보드 입력
        Scanner sc = new Scanner(System.in);
        while (true) {
            String key = sc.nextLine();
            if (key.toLowerCase().equals("q")) {
                break;
            }
        }

        // TCP 서버 종료
        stopServer();
    }

    public static void startServer() {
        // 스레드 Thread : 실행단위
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");
                    while (true) {
                        System.out.println("\n[서버] 연결 요청을 기다림\n");

                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트의 정보 얻기
                        InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " + socketAddress.getAddress() + ":" + socketAddress.getPort() + "의 연결 수락함");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버] 연결 종료");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    public static void stopServer() {
        try {
            serverSocket.close();
            System.out.println("[서버 종료]");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
