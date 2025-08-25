package java_advanced_01.day21_0825.pratice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

//문제 : 정수 배열 {5,10,15,20} dmf array.dat에 저장한 후 다시 읽어 합계와 평균을 구하고, 요소 순서대로 정렬하여 콘솔에 출력하세요
public class Prob14 {
    public static void main(String[] args) throws Exception {
        // DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("Temp/array.dat"));

        // 1. 정수 배열 {5, 10, 15, 20} ==> resource 저장 파일의 이름 지정
        int[] array = {5, 10, 15, 20};
        String fileName = "Temp/array.dat";

        // 2. 배열을 파일에 저장 로직 구현
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) {
            dataOutputStream.writeInt(array.length);    // 배열의 길이 먼저 저장
            for (int num : array) {
                dataOutputStream.writeInt(num);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // 3. 저장한 파일에서 배열 읽기 로직 구현
        int[] readArray = null;
        try (DataInputStream dataInputStream = new DataInputStream(new FileInputStream(fileName))) {
            int length = dataInputStream.readInt();
            readArray = new int[length];
            for (int i = 0; i < length; i++) {
                readArray[i] = dataInputStream.readInt();
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        }

        // 4. 배열에서 값을 요소를 모두 더하여 합계를 구하고 평균을 구한다.
        int sum = 0;
        double avg = 0.0;
        if (readArray != null) {
            for (int num : readArray) {
                sum += num;
            }
            avg = (double) sum / readArray.length;
        }

        // 5. 배열의 요소 순서대로 정렬해서 출력
        System.out.println("읽어온 배열: " + Arrays.toString(readArray));
        System.out.println("합계: " + sum);
        System.out.println("평균: " + avg);
    }
}
