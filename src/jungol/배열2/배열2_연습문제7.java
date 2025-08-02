package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 아래와 같은 파스칼 삼각형을 출력하는 프로그램을 작성하시오.
        // 파스칼 삼각형은 첫 번째 줄 첫 번째 행을 1로 초기화한 후
        // 다음 줄부터는 바로 위의 값과 바로 위 왼쪽의 값을 더한 값이 된다.

        // 파스칼 삼각형: an = n(n+1) / 2

        int[][] pascal = new int[6][7];

        for (int i = 0; i < 5; i++) { // 행
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal[i][j] + " ");

            }
            System.out.println();

        }

    }
}
