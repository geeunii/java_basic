package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int oddSum = 0; // 홀수의 합
        int count = 0; // 정수 입력 카운트

        while (true) {
            int num = sc.nextInt();

            if (num % 2 == 1) {
                oddSum += num;
                count++;
            }

            if (num == 0) break;

        }

        int avg = oddSum / count;
        System.out.println("홀수의 합 = " + oddSum);
        System.out.println("홀수의 평균 = " + avg);
    }
}
