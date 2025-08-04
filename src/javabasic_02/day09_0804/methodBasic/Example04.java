package javabasic_02.day09_0804.methodBasic;

import java.util.Scanner;

public class Example04 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("두 수를 차례로 입력하시오. - 나누기 결과 - ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int result = division(n1, n2);
        System.out.println("나누기 결과 : " + n1 + "/" + n2 + "의 결과는" + result);
        System.out.println(result);
    }

    public static int division(int number1, int number2) {
        int n1 = number1, n2 = number2, result = 0;
        if (n2 != 0) {
            result = n1 / n2;
        } else System.out.println("0으로 나누기 x");
        return result;
    }
}
