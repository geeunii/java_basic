package javabasic_02.day07_0731;

import java.util.Arrays;

public class DoubleArrayEx01 {
    public static void main(String[] args) {

        // 학생 3명의 국어, 영어, 수학 점수를 관리하는 2차원 배열 만들기
        int[][] scores = new int[3][3];

        // 1번 학생의 국어: 90, 영어: 50, 수학: 80을 저장하고 출력
        scores[0][0] = 90;
        scores[0][1] = 50;
        scores[0][2] = 80;

        // 2번 학생의 국어: 75, 영어: 85, 수학: 65을 저장하고 출력
        scores[1][0] = 80;
        scores[1][1] = 100;
        scores[1][2] = 90;

        // 3번 학생의 국어: 100, 영어: 90, 수학: 90을 저장하고 출력
        scores[2][0] = 100;
        scores[2][1] = 90;
        scores[2][2] = 90;

        // 각 학생들의 국어, 영어, 수학 점수와 총점과 평균을 학생별로 출력
        for (int i = 0; i < scores.length; i++) {
            int sum = 0; // 총점 초기화
            System.out.print((i + 1) + "번 학생의 점수: ");


            // 과목 이름 배열
            String[] subjects = {"국어", "영어", "수학"};
            // 각 학생의 과목별 점수를 출력하며 총점 계산
            for (int j = 0; j < scores[i].length; j++) {
                int score = scores[i][j]; // 해당 과목의 점수
                sum += score; // 과목의 점수 합계

                // 과목별 점수를 출력
                if (j < scores.length - 1) {
                    System.out.print(subjects[j] + ": " + score + ", ");
                } else {
                    System.out.println(subjects[j] + ": " + score);
                }

            }
            // 평균 계산
            double avg = (double) sum / scores[i].length;
            // 총점과 평균 출력
            System.out.printf("총점: %d, 평균: %.2f\n", sum, avg);
        }
    }
}
