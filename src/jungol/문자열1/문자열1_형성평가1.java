package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_형성평가1 {
    // 영문자 두 개를 입력 받아서 각각의 아스키코드의 합과 차를 출력하는 프로그램을 작성하시오.
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String input1 = sc.next();
        String input2 = sc.next();

        if (!input1.isEmpty() && Character.isLetter(input1.charAt(0)) &&
                !input2.isEmpty() && Character.isLetter(input2.charAt(0))) {

            char char1 = input1.charAt(0);
            char char2 = input2.charAt(0);

            int asciiSum = (int) char1 + (int) char2;
            int asciiDiff = Math.abs((int) char1 - (int) char2);

            System.out.print(asciiSum + " " + asciiDiff);
        } else {
            System.out.println("두 개의 영문자 입력");
        }

    }
}
