package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 3행 3열의 배열 두 개를 만들어서 입력을 받고
        // 두 배열의 합을 구하여 출력

        int[][] firstArray = new int[3][3];
        int[][] secondArray = new int[3][3];
        int[][] sumArray = new int[3][3];
        int num = 1;


        for (int i = 0; i < 3; i++) {
            System.out.printf("첫 번째 배열 %d행 ", num++); // 1행 2행 3행
            for (int j = 0; j < 3; j++) {
                firstArray[i][j] = sc.nextInt(); // 첫 번째 배열 입력
            }

        }

        num = 1;

        for (int i = 0; i < 3; i++) {
            System.out.printf("두 번째 배열 %d행 ", num++);
            for (int j = 0; j < 3; j++) {
                secondArray[i][j] = sc.nextInt(); // 두 번째 배열 입력

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumArray[i][j] = firstArray[i][j] + secondArray[i][j];
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}
