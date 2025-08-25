package java_advanced_01.day21_0825.pratice;

import java.io.*;

// 문제 9: 여러 줄 입력받아 파일에 저장
//        사용자가 입력하는 여러 줄을 받아 output.txt 파일에 저장하세요. 단, "exit"를 입력하면 종료합니다.
public class Prob9 {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("Temp/output.txt"));

            System.out.println("문장을 입력하세요. exit 입력시 종료");

            String line;
            while (!(line = br.readLine()).equals("exit")) {
                bw.write(line);

                bw.newLine(); // 줄바꿈
            }
            bw.close();
            br.close();
            System.out.println("파일 저장 완료");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
