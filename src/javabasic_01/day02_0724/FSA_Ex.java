package javabasic_01.day02_0724;

import java.util.Scanner;

public class FSA_Ex {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 점수 입력");
        a = sc.nextInt();

        System.out.println("두 번째 점수 입력");
        b = sc.nextInt();

        System.out.printf("a+b=%d \n", a, b, a+b);
        System.out.printf("a-b=%d \n", a, b, a-b);
        System.out.printf("a*b=%d \n", a, b, a*b);
        System.out.printf("a/b=%d \n", a, b, a/b);


        int kor, eng, total;
        double evg;

        kor = 77;
        eng = 87;
        total = kor + eng;
        evg = total/2;

        System.out.printf("총점:%d \n", total);
        System.out.printf("평균:%.1f \n", evg);

    }
}
