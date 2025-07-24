package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("두 수를 입력하시오. ");

        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        int multi = x * y;

        System.out.printf("%d + %d = %d\n", x, y, sum);
        System.out.printf("%d * %d = %d\n", x, y, multi);


    }
}
