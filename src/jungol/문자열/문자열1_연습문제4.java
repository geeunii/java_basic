package jungol.문자열;

import java.util.Scanner;

public class 문자열1_연습문제4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 문자열을 입력받아서 문자열의 길이를 구하고 입력받은 역순으로 출력하는 프로그램을 작성하시오.

        String str = sc.nextLine(); // 문자열 입력 받기

        int lenOfStr = str.length(); // 문자열의 길이
        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n", lenOfStr);

        for (int i = lenOfStr - 1; i >= 0; i--) { //for문 활용 역순 출력
            System.out.print(str.charAt(i));
        }

        System.out.println();

        String restr = new StringBuilder(str).reverse().toString(); // 빌더활용 역순 출력
        System.out.println(restr);


    }
}
