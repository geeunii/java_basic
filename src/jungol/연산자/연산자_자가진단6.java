package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean result1 = x > y;
        boolean result2 = x < y;
        boolean result3 = x >= y;
        boolean result4 = x <= y;

        System.out.printf("%d > %d --- %b\n", x, y, result1);
        System.out.printf("%d < %d --- %b\n", x, y, result2);
        System.out.printf("%d >= %d --- %b\n", x, y, result3);
        System.out.printf("%d <= %d --- %b", x, y, result4);

    }

}
