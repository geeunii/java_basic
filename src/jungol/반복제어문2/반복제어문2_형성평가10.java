package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x >= y) {
            for(int i = 1; i <= 9; i++) {
                for(int j = x; j >= y; j--) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println(); // 줄바꿈
            }
        } else {
            for(int i = 1; i <= 9; i++) {
                for(int j = x; j <= y; j++) {
                    System.out.printf("%d * %d = %2d   ", j, i, j * i);
                }
                System.out.println(); // 줄바꿈
            }
        }

    }

}
