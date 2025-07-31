package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_자가진단6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
        10 이하의 과목수 n이 주어진다.

        정수로 주어진 n개 과목의 점수를 입력받아서 실수 평균을 구하여 출력하고

        평균이 80점이상이면 "pass", 80점 미만이면 "fail"이라고 출력하는 프로그램을 작성하시오.

        평균은 반올림하여 소수 첫째자리까지 출력한다.
        */

        int cnt = 0;
        int sum = 0;

        int n = sc.nextInt(); // 과목 수 입력


        for (int i = 1; i <= n; i++) {
            int score = sc.nextInt();
            sum += score;
            cnt++;
        }

        double avg = (double) sum / cnt;

        System.out.printf("avg : %.1f\n", avg);

        if (80 <= avg) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

    }
}
