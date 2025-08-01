package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n행 입력

        int num = 1;

        for (int i = 0; i < n; i++) { // n의 행
            // 왼쪽 공백: i * 2칸 출력
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }

            // 숫자 출력: n - i 개
            for (int j = 0; j < n - i; j++) {
                System.out.print(num);
                if (j != n - i - 1) {
                    System.out.print(" ");
                }
                num++;
            }

            System.out.println();
        }


    }
}
