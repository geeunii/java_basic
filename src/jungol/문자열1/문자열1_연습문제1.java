package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 문자 하나를 입력 받아서 그 문자의 아스키 코드를 출력하는 작업을 반복하다가
        // ‘0’이 입력되면 아스키 코드를 출력하고 종료하는 프로그램을 작성하시오.

        while (true) {
            char n = sc.next().charAt(0);

            if (n == '0') {
                System.out.printf("%c -> %d\n", n, (int) n);
                break;
            }

            System.out.printf("%c -> %d\n", n, (int) n);

        }

        System.out.println("--- 강사님 풀이 ----");
        // 강사님 풀이
        while (true) {
            String inputStr = sc.next();
            char ch = inputStr.charAt(0);
            System.out.println(ch + " -> " + (int)ch);

            if (ch == '0') break;
        }


    }
}
