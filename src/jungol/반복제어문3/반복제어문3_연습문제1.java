package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number = 1;
        int total = 0;

        while (number <= n) {
            total += number;
            if (total > n) break;
            ++number;
        }

        System.out.printf("%1$d %2$d", number, total);
    }
}
