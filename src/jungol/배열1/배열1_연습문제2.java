package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. 26개의 문자배열을 선언
        // 2. 'A'부터 'Z'까지의 대문자를 차례롤 대입 시킨 후
        // 3. 배열의 마지막부터 처음까지 각 문자를 출력

        char[] array = new char[26];

        char i1 = 65;

        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (65 + i);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("========강사님 풀이=======");
        /// /// /// /// ///
        // 강사님 풀이
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) ('A' + i);

        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.printf("%c ", array[i]);

        }

        System.out.println();
        System.out.println("====================");
        for (char c : array) {
            System.out.printf("%c ", c);
        }

    }
}
