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

    }
}
