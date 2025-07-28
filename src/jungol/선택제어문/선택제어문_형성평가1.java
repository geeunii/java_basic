package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = Math.max(x, y) - Math.min(x, y);

        System.out.println(result);

    }

}
