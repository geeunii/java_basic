package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n <= 10) {
            for (int i = 1; i <= n; i++) {
                System.out.println("JUNGOL");
            }
        } else {
            System.out.println("10 이하의 수만 입력하시오.");
        }

    }

}
