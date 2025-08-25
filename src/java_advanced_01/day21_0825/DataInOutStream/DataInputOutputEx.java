package java_advanced_01.day21_0825.DataInOutStream;

import lombok.SneakyThrows;

import java.io.*;

public class DataInputOutputEx {

    @SneakyThrows
    public static void main(String[] args) {
        // 데이터입출력객체 생성
        FileOutputStream fos = null;
        DataOutputStream dos = null;

        fos = new FileOutputStream("Temp/primitive.db");
        dos = new DataOutputStream(fos);

        dos.writeUTF("Geuni");
        dos.writeInt(25);
        dos.writeDouble(3.14);
        dos.writeBoolean(Boolean.TRUE);

        dos.flush();
        dos.close();
        fos.close();

        // DataInputStream 객체
        FileInputStream fis = null;
        DataInputStream dis = null;

        fis = new FileInputStream("Temp/primitive.db");
        dis = new DataInputStream(fis);

        // for 루프를 제거하고 한 번만 읽도록 수정
        String name = dis.readUTF();
        int age = dis.readInt();
        double price = dis.readDouble();
        boolean flag = dis.readBoolean();
        System.out.println(name + " " + age + " " + price + " " + flag);

        dis.close();
        fis.close();
    }
}
