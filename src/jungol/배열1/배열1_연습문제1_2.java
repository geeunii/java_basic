package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제1_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array = new int[5]; // 5개의 정수 배열

        for (int i = 0; i < array.length; i++) { // 5개의 정수 입력받기
            array[i] = sc.nextInt();
        }

        for (int i : array) { // iter 방식으로
            System.out.printf("%d ", i);
        }

    }
}
