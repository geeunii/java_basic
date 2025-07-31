package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_자가진단1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램을 작성하시오.

        char a = sc.next().charAt(0); // 문자입력

        for (int i = 1; i <= 20; i++) {
            System.out.print(a);
        }
    }
}
