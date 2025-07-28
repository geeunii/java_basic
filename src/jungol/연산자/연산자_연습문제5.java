package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제5 {
    public static void main(String[] args) {
        // 삼항 연산자 활용

        Scanner sc = new Scanner(System.in);

        // 3개의 정수 입력
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 두 수가 같으면 1, 아니면 0 할당
        int result1 = (a == b) ? 1 : 0;
        int result2 = (b == c) ? 1 : 0;

        // 두 수가 다르면 1, 아니면 0 할당
        int result3 = (a != b) ? 1 : 0;
        int result4 = (b != c) ? 1 : 0;

        System.out.printf("%1$d %2$d %3$d %4$d", result1, result2, result3, result4);


    }
}
