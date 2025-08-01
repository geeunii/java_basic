package jungol.배열1;

import java.util.Scanner;

public class 배열1_형성평가1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 10개의 문자를 입력받아 마지막으로 입력받은 문자부터 첫 번째 입력받은 문자까지 차례로 출력하는 프로그램을 작성하시오.

        char[] ch = new char[10];

        for (int i = 0; i < ch.length; i++) { // ch의 길이까지
            ch[i] = sc.next().charAt(0); // 10개의 문자를 입력

        }

        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i] + " ");

        }


    }
}
