package jungol.연산자;

import java.util.Scanner;

public class 연산자_연습문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // a가 b보다 큰지, b가 c보다 크거나 같은지, a가 b보다 작거나 같은지, b가 c보다 작은지를 비교하여 참이면 1, 거짓이면 0

        int result1 = (a > b) ? 1 : 0;
        int result2 = (c <= b) ? 1 : 0;
        int result3 = (a <= b) ? 1 : 0;
        int result4 = (b < c) ? 1 : 0;

        System.out.printf("%d %d %d %d", result1, result2, result3, result4);

    }
}
