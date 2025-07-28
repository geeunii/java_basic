package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        // 최대값, 최소값 API 활용
        for (int i = Math.min(x, y); i <= Math.max(x, y); i++) {
            System.out.print(i + " ");
        }

    }

}
