package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_형성평가3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 0 부터 100 까지의 정수를 계속 입력 받음
        // 2. 범위를 벗어나는 수가 입력되면 그 이전까지 입력된 자료의 합계와 평균을 출력하는 프로그램 작성

        int sum = 0; // 합계 초기화
        int cnt = 0; //평균을 구하기 위한 카운팅

        while (true) {
            int n = sc.nextInt();

            if (n < 0 || n > 100) break;

            sum += n;
            cnt++;
        }

        double avg = (double) sum / cnt;

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", avg);

    }
}
