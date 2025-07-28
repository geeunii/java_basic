package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float avg = sc.nextFloat();

        switch ((int) avg) {
            case 4:
                System.out.print("scholarship");
                break;
            case 3:
                System.out.print("next semester");
                break;
            case 2:
                System.out.print("seasonal semester");
                break;
            default:
                System.out.print("retake");
                break;
        }


    }

}
