package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_자가진단6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char num = 65;

        if (n >= 1 && n <= 6) {

            for (int i = 1; i <= n; i++) {
                for (int j = n; j >= i; j--) {
                    System.out.print(num);
                    num++;
                }


                System.out.println();
            }

        }

    }
}
