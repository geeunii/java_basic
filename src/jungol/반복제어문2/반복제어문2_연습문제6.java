package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_연습문제6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램을 작성하시오. (평균은 반올림하여 소수 첫째자리까지 출력한다.)

        int sum = 0; // 총점 초기화

        for (int i = 1; i <= 5; i++) {
            int n = sc.nextInt();
            sum += n;
        }

        float avg = (float) sum / 5;

        System.out.printf("총점 : %d\n", sum);
        System.out.printf("평균 : %.1f", avg);
    }
}
