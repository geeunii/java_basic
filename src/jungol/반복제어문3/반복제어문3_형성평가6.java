package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 줄 수 입력

        for (int i = 1; i <= n; i++) {
            // 공백 출력 (오른쪽 정렬을 위한)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // 공백 2칸
            }

            // 별 출력 (홀수 개씩 증가)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

                if(j != i) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
