package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > y) {
            System.out.printf("입력받은 수 중 큰 수는 %1$d이고 작은 수는 %2$d입니다.", x, y);
        } else {
            System.out.printf("입력받은 수 중 큰 수는 %1$d이고 작은 수는 %2$d입니다.", y, x);
        }

    }

}
