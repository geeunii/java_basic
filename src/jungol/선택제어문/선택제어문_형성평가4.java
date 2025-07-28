package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number? ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.print("dog");
                break;
            case 2:
                System.out.print("cat");
                break;
            case 3:
                System.out.print("chick");
                break;
            default:
                System.out.print("I don't know.");
        }


    }

}
