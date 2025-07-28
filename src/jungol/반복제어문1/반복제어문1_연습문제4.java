package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 정수를 계속 입력 받다가 0이 입력되면 0을 제외하고
        // 이전에 입력된 자료의 수와 합계, 평균을 출력하는 프로그램 (소수 둘째자리)

        int count = 0; // 정수 카운팅
        int sum = 0; // 합계 초기화
        double avg = 0;

        while (true) {
            int n = sc.nextInt(); // 정수 입력

            if (n == 0) break;

            sum += n;
            count++;

        }

        avg = (double) sum / count;
        System.out.println("입력된 자료의 개수 = " + count);
        System.out.println("입력된 자료의 합계 = " + sum);
        System.out.printf("입력된 자료의 평균 = %.2f", avg);

    }
}
