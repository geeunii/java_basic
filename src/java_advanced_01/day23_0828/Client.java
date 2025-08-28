package java_advanced_01.day23_0828;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

    private static Socket socket = null;

    public static void main(String[] args) {

        try {
            socket = new Socket("localhost", 5001);
            System.out.println("[Client] 서버 연결 성공");
            socket.close();
            System.out.println("[Client] 소켓 닫음");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
