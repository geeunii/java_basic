package jungol.문자열1;

import java.util.Scanner;

public class 문자열1_연습문제9 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String inputString = sc.nextLine();

        int lenOfStr = inputString.length();

        for (int i = 1; i <= lenOfStr; i++) {
            System.out.println(inputString.substring(i) + inputString.substring(0, i));

        }

    }
}
