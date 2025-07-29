package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; ; i++) {
            int multiple = n * i;

            if (multiple >= 100) break;

            System.out.print(multiple + " ");

            if (multiple % 10 == 0) break;
        }

    }
}
