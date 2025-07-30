package javabasic_01.day05_0729.forEx;

import java.util.Scanner;

public class StartEx06_02 {

    public static void main(String[] args) {

        int row, col; // 행과 열

        Scanner sc = new Scanner(System.in);
        System.out.println("몇 행의 피라미드 ?");
        int n = sc.nextInt();

        for (row = 1; row <= n; row++) { // 사용자 입력값이 row(행) 결정

            for (col = row; col < (n - 1); col++) {
                System.out.print("_");
            }

            for (col = 1; col <= (2 * row - 1); col++) {
                System.out.print("*");
            }

            System.out.println();

        }


    }
}
