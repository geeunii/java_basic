package javabasic_01.day03_0725;

import java.util.Scanner;

public class PrintfEx {
    public static void main(String[] args) {

        int x = 5000;
        System.out.printf("상품의 가격: %d원\n", x);
        System.out.printf("상품의 가격: %7d원\n", x);
        System.out.printf("상품의 가격: %06d원\n", x);

        System.out.println("반지름을 입력하세요. ");
        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        System.out.printf("반지름의 %d인 원의 넓이: %.1f", rad, rad * rad * Math.PI);
    }
}
