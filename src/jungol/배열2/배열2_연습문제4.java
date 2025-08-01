package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 3행 3열의 배열을 선언하고 초기화한 후 출력

        int[][] arrays = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arrays[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }

    }
}
