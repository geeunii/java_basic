package jungol.문자열;

import java.util.Scanner;

import static java.lang.Character.*;

public class 문자열1_연습문제8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String inputString = sc.nextLine();
        String[] splitArray = inputString.split(" "); // 공백 기준 분리 및 배열 생성

        for (int i = 0; i < splitArray.length; i++) {
            String string = splitArray[i];
            System.out.println(string);
        }

    }
}
