package java_advanced_01.day24_0829.chatPro;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 채팅방의 관리자입니다. 서버 프로그램을 실행하는 메인 클래스로,
// 클라이언트의 연결 요청을 받아 SocketClient 에 연결
public class ChatServer {
    public static final int PORT = 50001;  // 포트 번호 50001
    public static ServerSocket serverSocket; // 서버 소켓. 클라이언트의 요청을 받기 위한 메인 소켓
    public static ExecutorService threadPool = Executors.newFixedThreadPool(100);   // 스레드풀. 클라이언트 처리를 위해 스래드들을 관리
    public static Map<String, SocketClient> chatRoom = new ConcurrentHashMap<>();   // 통신용 클라이언트 관리하는 Map

    // = Collections.synchronizedMap(new HashMap<>());
    // 1인용 공중 화장실, 여러 개의 칸이 있는 공중 화장실.

    public static void main(String[] args) {
        try {
            ChatServer chatServer = new ChatServer();
            chatServer.serverStart();

            System.out.println("----------------------------------------------------");
            System.out.println("서버를 종료하려면 q를 입력하고 Enter.");
            System.out.println("----------------------------------------------------");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String key = br.readLine();
                if (key.equals("q")) break;
            }
            br.close();
            chatServer.stop();
        } catch (IOException e) {
            System.out.println("[서버] " + e.getMessage());
        }
    }

    public void serverStart() {  // 서버 시작
        try {
            serverSocket = new ServerSocket(PORT);  // 서버 소켓 생성 및 포트 바인딩
            System.out.println("Server Started");

            Thread thread = new Thread(() -> {
                try {
                    while (!serverSocket.isClosed()) {  // 람다식이 하는 일을 개발자가 지정
                        Socket socket = serverSocket.accept();  // 연결 수락
                        SocketClient client = new SocketClient(this, socket); // 통신용 SocketClient 를 반복해서 생성
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
    public void addSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp; // 클라이언트의 정보를 이용하여 key 생성
        chatRoom.put(key, socketClient);
        System.out.println("입장 > :" + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }

    // 클라이언트가 연결 종료 시 SocketClient chatRoom 에서 제거 메소드
    public void removeSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.remove(key, socketClient);
        System.out.println("퇴장 > :" + key);
        System.out.println("현재 채팅자 수: " + chatRoom.size() + "\n");
    }

    // 메시지 브로드캐스트 기능 : JSON 메시지를 생성하여 채팅방에 있는 모든 클라이언트에 보내는 기능
    public void sendToAll(SocketClient sender, String message) {
        JSONObject root = new JSONObject();
        root.put("ClientIP", sender.clientIp);
        root.put("ChatName", sender.chatName);
        root.put("message", message);
        String json = root.toString();

        // 모든 SocketClient로 하여금
        // send()로 JSON 메시지를 보내게 한다.
        Collection<SocketClient> clients = chatRoom.values();
        for (SocketClient client : clients) {
            if (client == sender) continue;
            client.send(json);
        }
    }

    public void stop() {
        try {
            serverSocket.close();
            threadPool.shutdown();
            chatRoom.clear();
            System.out.println("서버 종료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
