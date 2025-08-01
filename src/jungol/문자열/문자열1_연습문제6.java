package jungol.문자열;

import java.util.Scanner;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class 문자열1_연습문제6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            String str = sc.nextLine();
            char ch = str.charAt(0);

            if ((int) ch >= 123 || (int) ch <= 47) {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }

            if (isDigit(ch)) { // 숫자,문자 인지 알아서 해주는 메소드
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println(isUpperCase(ch) ? "대문자입니다." : "소문자입니다.");
            }


        }


    }
}
