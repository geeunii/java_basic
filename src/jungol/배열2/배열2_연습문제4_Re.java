package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제4_Re {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 3행 3열의 배열을 선언하고 초기화한 후 출력

        int[][] arr = {
                {3, 5, 4},
                {2, 6, 7},
                {8, 10, 1}
        };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 줄바꿈
        }

    }
}
