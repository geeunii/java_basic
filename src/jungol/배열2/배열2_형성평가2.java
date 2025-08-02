package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 학생들의 점수를 입력을 받다가 0이 입력되면
        // 그 때까지 입력받은 점수를 10점 단위로 구분하여
        // 점수대별 학생 수를 출력하는 프로그램을 작성하시오.
        // (1명도 없는 점수는 출력하지 않는다.)
        // 학생은 최대 100명이하

        int[] cnt = new int[11]; // cnt[0] ~ cnt[10]

        while (true) {
            int score = sc.nextInt();

            if (score == 0) break;

            if (score >= 0 && score <= 100) {
                int index = score / 10;
                cnt[index]++;
            }

        }

        for (int i = 10; i >= 0; i--) {
            if (cnt[i] > 0) {
                System.out.printf("%d : %d person\n", i * 10, cnt[i]);
            }

        }


    }
}
