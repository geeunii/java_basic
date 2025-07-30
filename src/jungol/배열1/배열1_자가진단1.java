package jungol.배열1;

import java.util.Scanner;

public class 배열1_자가진단1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. 문자 10개를 저장할 수 있는 배열을 만들기
        // 2. 10개의 문자를 입력받아 입력받은 문자를 이어서 출력

        char[] array = new char[10]; // 문자 10개 저장 배열

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next().charAt(0);
        }

        for (char c : array) {
            System.out.printf("%c", c);
        }


    }
}
