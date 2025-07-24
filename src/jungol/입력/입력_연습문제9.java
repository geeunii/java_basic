package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 개의 실수를 입력하시오.");

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.printf("x = %.2f\n", x);
        System.out.printf("y = %.2f", y);

    }
}
