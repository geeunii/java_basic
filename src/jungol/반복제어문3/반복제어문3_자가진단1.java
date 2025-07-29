package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_자가진단1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 1. 자연수 n 입력받고
        int n = sc.nextInt();

        // 2. 홀수 차례대로 더해가면서 합이 n 이상이면
        // 그때까지 더해진 홀수의 개수와 그 합을 출력하는 프로그램

        int oddSum = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                if (oddSum < n) {
                    oddSum += i;
                    oddCount++;
                }
            }
        }

        System.out.printf("%d %d", oddCount, oddSum);
    }
}
