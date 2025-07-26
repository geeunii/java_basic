package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int x1 = x + 100;
        int y1 = y % 10;

        System.out.println(x1 + " " + y1);

    }

}
