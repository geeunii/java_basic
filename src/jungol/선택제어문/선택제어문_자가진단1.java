package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        System.out.println(x);
        if (x < 0) {
            System.out.println("minus");
        }

    }

}
