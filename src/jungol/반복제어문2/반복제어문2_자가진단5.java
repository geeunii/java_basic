package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_자가진단5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램을 작성하시오.

        int threeCnt = 0;
        int fiveCnt = 0;

        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt(); // 10개의 정수 입력받기
            if (n % 3 == 0) { // 3배수
                threeCnt++;
            }

            if (n % 5 == 0) { //5배수
                fiveCnt++;
            }
        }

        System.out.printf("Multiples of 3 : %d\n", threeCnt);
        System.out.printf("Multiples of 5 : %d", fiveCnt);

    }
}
