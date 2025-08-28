package java_advanced_01.day23_0828.socketProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InputMismatchException;

public class Server {

    public static final int PORT = 5000;

    public static void main(String[] args) {

        serverStart();

    }

    public static void serverStart() {
        Thread thread = new Thread(() -> {
            try {
                ServerSocket serverSocket = new ServerSocket(PORT);
                System.out.println("[Server] Start");

                while (true) {
                    System.out.println("[Server] 요청 대기");


                    Socket socket = serverSocket.accept();
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();

                    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력처리" + e.getMessage());
            } catch (IOException e) {
                System.out.println("연결 끊김" + e.getMessage());
            }

        }
        );
        thread.start();
    }
}
