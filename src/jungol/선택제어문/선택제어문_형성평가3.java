package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 400 배수 윤년, 100 배수 평년

        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.print("leap year");
        } else {
            System.out.print("common year");
        }

    }

}
