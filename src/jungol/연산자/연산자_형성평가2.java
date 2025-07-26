package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int div = x / y;
        int mod = x % y;

        System.out.printf("%d / %d = %d...%d", x, y, div, mod);


    }
}
