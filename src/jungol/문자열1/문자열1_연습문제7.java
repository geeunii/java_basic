package jungol.문자열1;

import java.util.Scanner;

import static java.lang.Character.*;

public class 문자열1_연습문제7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String tmpStr = sc.nextLine(); // tmpStr 입력
        int lenOfStr = tmpStr.length(); // tmpStr의 길이 체크를 lenOfStr에 할당

        for (int i = 0; i < lenOfStr; i++) { // Upper와 Lower 그리고 삼향연산자 활용
            System.out.print(isUpperCase(tmpStr.charAt(i)) ?
                    toLowerCase(tmpStr.charAt(i)) : toUpperCase(tmpStr.charAt(i)));
        }


    }
}
