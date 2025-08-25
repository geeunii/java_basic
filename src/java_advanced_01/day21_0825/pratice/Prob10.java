package java_advanced_01.day21_0825.pratice;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

// 문제 10: 키보드 입력을 파일로 저장 (바이트 스트림)
//       사용자가 입력한 내용을 keyboard.txt에 저장하세요. 단, exit 입력 시 종료합니다.
public class Prob10 {

    @SneakyThrows
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OutputStream os = new FileOutputStream("Temp/keyboard.txt");

        System.out.println("문장을 입력하세요 (exit 입력 시 종료):");
        String line;
        while (!(line = br.readLine()).equals("exit")) {
            os.write(line.getBytes());
            os.write('\n');
        }

        os.close();
        br.close();
        System.out.println("저장 완료!");
    }
}
