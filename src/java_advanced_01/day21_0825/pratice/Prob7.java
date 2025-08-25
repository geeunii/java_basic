package java_advanced_01.day21_0825.pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// 문제 7: 파일 크기 출력
//        copy.jpg 파일의 크기를 바이트 단위로 출력하세요.
public class Prob7 {

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("Temp/imageCopy.webp");
            int fileSize = is.available();
            System.out.println("파일크기 : " + fileSize);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
