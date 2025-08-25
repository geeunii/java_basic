package java_advanced_01.day21_0825.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

// 문제 3: 텍스트 파일에 저장된 문자 수 세기
//         hello.txt 파일의 문자 수를 세어 화면에 출력하세요.
public class Prob3 {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("Temp/hello.txt");

            byte[] array = new byte[100];

            while (true) {

                int data = is.read(array);

                if (data == -1) {
                    break;
                }
                for (int i = 0; i < data; i++) {
                    System.out.print(array[i] + " ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
