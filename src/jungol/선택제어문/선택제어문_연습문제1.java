package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(x);
        if (x > 10) {
            System.out.println("10보다 큰 수를 입력하셨습니다.");
        }

    }

}
