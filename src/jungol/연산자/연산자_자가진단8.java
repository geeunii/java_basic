package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean result1 = (a > b) && (a > c);
        boolean result2 = (a == b) && (a == c) && (b == c);

        System.out.printf("%b %b", result1, result2);

    }

}
