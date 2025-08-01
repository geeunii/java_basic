package jungol.문자열;

import java.util.Scanner;

public class 문자열1_연습문제3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 문자열을 선언하고 "jungol olympiad"로 초기화 한 후
        // 0~14 사이의 정수 5개를 입력 받아
        // 문자열에서 해당하는 위치의 문자를 차례로 출력하는 프로그램을 작성하시오.
        // 문자열의 맨 앞의 위치는 0이다.

        String str = "jungol olympiad";

        for (int i = 0; i < 5; i++) {
            int n = sc.nextInt(); // 0~14 사이의 정수 5개

            if(n > 14 || n < 0) {
                break;
            }

            System.out.print(str.charAt(n));

        }



    }
}
