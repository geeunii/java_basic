package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if (0 < x) {
            System.out.print("plus");
        } else if (0 > x) {
            System.out.println("minus");
        } else {
            System.out.print("zero");
        }

    }

}
