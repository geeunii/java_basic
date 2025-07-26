package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("5개의 수를 입력하시오. ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        int sum = a + 3;
        int diff = b - 3;
        int mul = c * 3;
        int div = d / 3;
        int mod = e % 3;

        System.out.println(sum + " " + diff + " " + mul + " " + div + " " + mod);


    }
}
