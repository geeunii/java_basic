package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제1_1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[5];   // 정수 변수들의 묶음 입니다. -> int[]

//        array[0] = sc.nextInt();
//        array[1] = sc.nextInt();
//        array[2] = sc.nextInt();
//        array[3] = sc.nextInt();
//        array[4] = sc.nextInt();

        System.out.println("========itar 방식 입력========");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();

        }

        System.out.println("========iter 방식 출력========");
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("========itar 방식 출력========");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
