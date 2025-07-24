package jungol.입력;

import java.util.Scanner;

public class 입력_연습문제8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("키를 입력하세요. ");
        int height = sc.nextInt();

        System.out.printf("몸무게를 입력하세요. ");
        float weight = sc.nextFloat();

        System.out.printf("이름을 입력하세요. ");
        String name = sc.next();

        System.out.printf("키 = %d\n", height);
        System.out.printf("몸무게 = %.1f\n", weight);
        System.out.printf("이름 = %s", name);


    }
}
