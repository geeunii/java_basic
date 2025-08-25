package java_advanced_01.day21_0825.Reader;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws Exception {

        Reader reader = null;

        // 1. 문자 하나씩 읽기
        reader = new FileReader("Temp/testChar.txt");
        while (true) {
            int data = reader.read();

            if (data == -1) break;
            System.out.print((char) data + " ");
        }

        reader.close();
        System.out.println();
        // 2. 문자 배열로 읽기
        reader = new FileReader("Temp/testChar.txt");
        char[] data = new char[100];

        while (true) {
            int numRead = reader.read(data);
            if (numRead == -1) break;
            for (int i = 0; i < numRead; i++) {
                System.out.print(data[i]);
            }
        }

        reader.close(); // 꼭 사용한 스트림 닫기
    }
}
