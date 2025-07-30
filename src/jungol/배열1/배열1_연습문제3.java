package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. 정수 10개를 입력받은 후
        // 2. 세 번째, 다섯 번째와 마지막으로 입력받은 정수를 차례로 출력
        int array[] = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.printf("%d %d %d", array[2], array[4], array[9]);

        System.out.println();
        System.out.println("==== 강사님 풀이 ====");
        System.out.println();

        // 1. 정수 10개를 입력받아라 (같은 타입의 값의 저장 => 배열에 반복문을 통해서 처리하가)
        int[] outputArray = new int[10];

        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = sc.nextInt();
        }
        // 2. 출력조건이 정수형 배열에서 세 번째(index 2), 다섯 번째(index 4), 마지막 번째(index 9) 값을 차례로 출력하기.
        for (int i = 0; i < outputArray.length; i++) {

            if (i == 2 || i == 4 || i == 9) {
                System.out.printf("%d ", outputArray[i]);
            }
        }

    }
}
