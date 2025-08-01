package jungol.배열2;

import java.util.Arrays;
import java.util.Scanner;

public class 배열2_연습문제3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 피보나치 수열이란 첫 번째 항과 두 번째 항만 1이고 나머지 항은 바로 앞의 두 항의 합과 같은 수열을 말한다.
        // 각 항의 값을 계산하는 다음의 예를 보고 피보나치 수열의 10, 20, 30, 40항의 값을 출력하는 프로그램을 작성하시오.

        // 피보나치 수열 10항 : 55
        // 피보나치 수열 20항 : 6765
        // 피보나치 수열 30항 : 832040
        // 피보나치 수열 40항 : 102334155

        // F(1) = 1
        // F(2) = 1
        // F(n) = F(n-1) + F(n-2)

        int[] sum = new int[40 + 1];

        sum[1] = 1;
        sum[2] = 1;

        for (int i = 3; i <= 40; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }

        System.out.println("피보나치 수열 10항 : " + sum[10]);
        System.out.println("피보나치 수열 20항 : " + sum[20]);
        System.out.println("피보나치 수열 30항 : " + sum[30]);
        System.out.println("피보나치 수열 40항 : " + sum[40]);

    }
}
