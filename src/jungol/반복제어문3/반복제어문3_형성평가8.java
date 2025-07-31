package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n행 입력

        int num = 1;

        for (int i = 1; i <= n; i++) { // n행
            for (int j = i; j >= 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
