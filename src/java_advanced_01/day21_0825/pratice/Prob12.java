package java_advanced_01.day21_0825.pratice;

import java.io.*;

//문제 : 10,20,30 을 numbers.dat 파일에 저장하고 다시 읽어 콘솔에 출력하세요
public class Prob12 {
    public static void main(String[] args) throws Exception {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;

        fileOutputStream = new FileOutputStream("Temp/numbers.dat");
        dataOutputStream = new DataOutputStream(fileOutputStream);

        dataOutputStream.writeInt(10);
        dataOutputStream.writeInt(20);
        dataOutputStream.writeInt(30);

        dataOutputStream.flush();
        dataOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;

        fileInputStream = new FileInputStream("Temp/numbers.dat");
        dataInputStream = new DataInputStream(fileInputStream);

        int num1 = dataInputStream.readInt();
        int num2 = dataInputStream.readInt();
        int num3 = dataInputStream.readInt();

        System.out.println(num1 + " " + num2 + " " + num3);


    }
}
