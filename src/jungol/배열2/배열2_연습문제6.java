package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 학생 3명의 국어, 영어, 수학 점수를 입력받아
        // 학생별 총점과 과목별 합계를 아래와 같이 출력하는 프로그램을 작성하시오.

        int[][] studentScore = new int[3][3]; // 학생 점수 배열 선언
        String[] subjects = {"국어", "영어", "수학"}; // 국영수 배열 선언

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d번째 학생의 점수 ", i + 1);
            for (int j = 0; j < 3; j++) {
                studentScore[i][j] = sc.nextInt(); // 점수 입력
            }

        }

        System.out.println("     국어 영어 수학 총점");

        for (int i = 0; i < 3; i++) { // 각 학생 접수의 합
            int sum = 0;
            System.out.printf("%2d번", i + 1);
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", studentScore[i][j]);
                sum += studentScore[i][j]; // 점수 합 저장
            }
            System.out.printf("%4d\n", sum);
        }

        System.out.print("합계 ");
        int totalSum = 0;
        for (int j = 0; j < 3; j++) {
            int subjectSum = 0;
            for (int i = 0; i < 3; i++) {
                subjectSum += studentScore[i][j]; // 과목 점수 합 저장
            }
            System.out.printf("%d ", subjectSum);
            totalSum += subjectSum;
        }

        System.out.printf("%d\n", totalSum);
    }
}
