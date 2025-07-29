package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_연습문제6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) { // 행의 갯수

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }

            System.out.println();
        }


    }
}
