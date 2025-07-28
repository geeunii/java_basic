package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("number? ");
            int n = sc.nextInt();

            if (1 <= n) {
                System.out.println("positive integer");
            } else if (n < 0) {
                System.out.println("negative number");
            }

            if (n == 0) break;
        }

    }
}
