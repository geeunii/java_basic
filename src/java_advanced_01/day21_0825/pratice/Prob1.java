package java_advanced_01.day21_0825.pratice;

import java.io.*;
import java.util.Arrays;

// 문제 1: 텍스트 파일에 문자열 저장
//         문자열 "Hello Java!"를 hello.txt에 저장하세요.
public class Prob1 {

    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("Temp/hello.txt");

            String str = "Hello Java!";
            writer.write(str);

            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
