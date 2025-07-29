package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_자가진단5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) { // 피라미드의 행

            for (int j = 1; j < i; j++) { // 공백
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (n - i) + 1; j++) { // 피라미드 별
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
