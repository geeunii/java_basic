package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. 최대 100개 까지의 정수를 차례로 입력 받다가
        // 2. 0이 입력되면 입력을 중단
        // 3. 짝수 번째에 입력된 정수를 모두 출력.

        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] == 0) break;
        }

        for (int i = 0; i <= array[i]; i++) {
            if (i % 2 == 1) {
                System.out.printf("%d ", array[i]);
            }

        }

        System.out.println("""
                
                === 강사님 풀이 ===
                
                """);

        // 1. 100개의 정수형 배열에 차례로 입력데이터 저장
        int[] outputArray = new int[100];
        int repeatNum = 0;

        // 2. 입력받다가 0이 입력되면, 입력받은 값을 (0인지 아닌지 확인)
        while (repeatNum < 100) {

            outputArray[repeatNum] = sc.nextInt();
            if (outputArray[repeatNum] == 0) {
                break;
            }
            repeatNum++;
        }

        // 3. 만약 0이면 입력을 중지하고 짝수 번째 입력값(인덱스는 호수)을 출력
        for (int i = 0; i < repeatNum; i++) {
            if (i % 2 == 1) {
                System.out.printf("%d ", outputArray[i]);
            }
        }


    }
}
