package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_형성평가2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int oddCnt = 0; // 홀수 카운팅
        int evenCnt = 0; // 짝수 카운팅

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;

            if (n % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }

        }

        System.out.println("odd : " + oddCnt);
        System.out.println("even : " + evenCnt);
    }
}
