package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_형성평가5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char answer;

        do {
            // 밑변과 높이 입력
            System.out.print("Base = ");
            double base = sc.nextDouble();

            System.out.print("Height = ");
            double height = sc.nextDouble();

            // 넓이 계산 (소수 첫째자리까지 반올림)
            double area = base * height / 2;
            System.out.printf("Triangle width = %.1f\n", area);

            // 계속할지 여부 확인
            System.out.print("Continue? ");
            answer = sc.next().charAt(0);

        } while (answer == 'Y' || answer == 'y');

        sc.close();




    }
}
