package java_advanced_01.day21_0825.pratice;

import java.io.*;

// 문제 6: 이미지 복사 (바이트 스트림 활용)
//        image.jpg 파일을 읽어서 copy.jpg 파일로 복사하세요.  image.jpg는 여러분이 지정합니다.
public class Prob6 {

    public static void main(String[] args) {
        try {
            String originalFileName = "Temp/image.webp";
            String newFileName = "Temp/imageCopy.webp";

            InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(newFileName);

            is.transferTo(os);

            os.flush();

            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
