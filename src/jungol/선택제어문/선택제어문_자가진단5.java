package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float x = sc.nextFloat();
        float y = sc.nextFloat();

        if (4.0 <= x && 4.0 <= y) {
            System.out.print("A");
        } else if (3.0 <= x && 3.0 <= y) {
            System.out.print("B");
        } else {
            System.out.print("C");
        }


    }

}
