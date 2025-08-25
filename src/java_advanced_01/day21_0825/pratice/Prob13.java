package java_advanced_01.day21_0825.pratice;

import java.io.*;

//문제 : 정수 100, 실수 3.14, 문자열 "Java" , 불리언 true 를 data.dat에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob13 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = new FileOutputStream("data.dat");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeInt(100);
        dataOutputStream.writeDouble(3.14);
        dataOutputStream.writeUTF("Java");
        dataOutputStream.writeBoolean(true);

        dataOutputStream.flush();
        dataOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;

        fileInputStream = new FileInputStream("data.dat");
        dataInputStream = new DataInputStream(fileInputStream);

        int x = dataInputStream.readInt();
        double y = dataInputStream.readDouble();
        String str = dataInputStream.readUTF();
        boolean flag = dataInputStream.readBoolean();

        System.out.println(x + " " + y + " " + str + " " + flag);
    }
}
