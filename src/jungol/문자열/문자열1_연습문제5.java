package jungol.문자열;

import java.util.Scanner;

public class 문자열1_연습문제5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 다음과 같이 “우리나라 대한민국!”을 문자형 배열에 초기화하고
        // 길이를 구하여 다음과 같이 출력하는 프로그램을 작성하시오.

        String str = "우리나라 대한민국!"; // 문자형 배열 초기화
        char[] letters = str.toCharArray();

        int strlength = letters.length; // 길이 구하기

        System.out.println(letters);
        System.out.printf("위 문자열의 길이는 %d입니다.", strlength);



    }
}
