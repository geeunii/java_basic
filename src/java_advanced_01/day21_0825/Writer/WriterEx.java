package java_advanced_01.day21_0825.Writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx {
    // Writer 클래스를 활용하여 하나의 문자, 문자 배열, 문자열 출력하는 기능 구현

    public static void main(String[] args) throws Exception {
        Writer writer = new FileWriter("Temp/testChar.txt");

        // 1. 문자씩 파일 출력
        char ch1 = 'A';
        writer.write(ch1);
        char ch2 = 'B';
        writer.write(ch2);

        // char 배열 파일 출력
        char[] chars = {'C', 'E', 'D', 'F'};
        writer.write(chars);

        String str = "Hello IOStream";
        writer.write(str);

        writer.flush();
        writer.close();
    }

}
