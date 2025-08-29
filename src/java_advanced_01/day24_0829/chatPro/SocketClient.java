package java_advanced_01.day24_0829.chatPro;

import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

// 채팅방 사용자 전담 직원
// 클라이언트와 1:1로 통신하는 역할
public class SocketClient {
    // 필요 객체(필드)
    ChatServer chatServer;  // ChatServer() 메소드를 호출을 위해.
    Socket socket;  // 연결을 끊을 때 필요
    DataInputStream dis;    // 문자열을 읽을 때
    DataOutputStream dos;   // 문자열을 보낼 때
    String clientIp;    // 클라이언트 Ip
    String chatName;    // 닉네임(대화명)


    public SocketClient(ChatServer chatServer, Socket socket) {
        try {
            this.chatServer = chatServer;
            this.socket = socket;
            this.dis = new DataInputStream(socket.getInputStream());
            this.dos = new DataOutputStream(socket.getOutputStream());
            InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
            this.clientIp = isa.getHostName();
            receive();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void receive() {
        ChatServer.threadPool.execute(() -> {

            try {
                String receiveJson = dis.readUTF();
                JSONObject obj = new JSONObject(receiveJson);
                String command = obj.getString("command");

                switch (command) {
                    case "incomming" :
                        this.chatName = obj.getString("data");
                        chatServer.sendToAll(this, "입장하였습니다.");
                        chatServer.addSocketClient(this);
                        break;
                    case "message":
                        String message = obj.getString("data");
                        chatServer.sendToAll(this, message);
                        break;
                }
            } catch (IOException e) {
                chatServer.sendToAll(this, "퇴장하셨습니다.");
                chatServer.removeSocketClient(this);
            }
        });
    }

    public void send(String json) {
        try {
            dos.writeUTF(json);
            dos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
