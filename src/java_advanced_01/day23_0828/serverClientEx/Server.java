package java_advanced_01.day23_0828.serverClientEx;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    private static ServerSocket serverSocket = null;

    public static void main(String[] args) {

        // 서버 시작
        startServer();
    }

    static void startServer() {
        while (true) {
            try {
                serverSocket = new ServerSocket(5001);
                System.out.println("[Server] start");

                Socket socket = serverSocket.accept();
                System.out.println("[Server] connect");

                InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
                System.out.println("[Server] " + inetSocketAddress.getHostName() + "의 연결 요청을 수락함");

            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                stopServer();
            }
        }
    }

    static void stopServer() {
        try {
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
                System.out.println("[Server] stop");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
