package javabasic_02.day09_0804.methodBasic;

import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void adder(int x, int y, int addSum) {
        System.out.println("결과는");
        System.out.printf("%d + %d = %d\n\n", x, y, addSum);

    }

    public static void minus(int x, int y, int minusSum) {
        System.out.println("결과는");
        System.out.printf("%d - %d = %d\n\n", x, y, minusSum);

    }

    public static void multi(int x, int y, int multiSum) {
        System.out.println("결과는");
        System.out.printf("%d * %d = %d\n\n", x, y, multiSum);

    }

    public static void division(int x, int y, double divisionSum) {
        System.out.println("결과는");
        System.out.printf("%d / %d = %.1f\n\n", x, y, divisionSum);

    }


    public static void main(String[] args) {

        int addSum = 0, minusSum = 0, multiSum = 0;
        double divisionSum = 0;

        while (true) {
            System.out.println("""
                    =================================================
                                      사칙연산 계산기        
                    =================================================
                    1. 덧셈   2. 뺄셈   3. 곱셈   4. 나눗셈  5. 프로그램 종료
                    
                    두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해 주세요.
                    """);
            int x = sc.nextInt(); // 첫 수 입력
            int y = sc.nextInt(); // 둘 수 입력
            int menu = sc.nextInt(); // 메뉴 수 입력

            switch (menu) {
                case 1:
                    addSum = x + y;
                    adder(x, y, addSum);

                case 2:
                    minusSum = x - y;
                    minus(x, y, minusSum);

                case 3:
                    multiSum = x * y;
                    multi(x, y, multiSum);

                case 4:
                    divisionSum = (double) x / y;
                    division(x, y, divisionSum);

            }

        }
    }


}
