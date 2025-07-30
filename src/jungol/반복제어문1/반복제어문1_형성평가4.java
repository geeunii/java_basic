package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_형성평가4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. 0이 입력될 때 까지 정수를 계속 입력받음 (반복문)
        // 2. 3의 배수와 5의 배수를 제외한 (%3 나머지가 0 , %5 나머지가 0) 수들의 개수를 출력

        int cnt = 0; // 수들의 개수 카운팅

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;

            if (n % 3 == 0 || n % 5 == 0) {

            } else {
                cnt++;
            }

        }
        System.out.println(cnt);

    }
}
