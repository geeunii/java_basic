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

    }
}
