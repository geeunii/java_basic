package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        if(1 <= month && month <= 12) {

            switch (month) {
                case 1:
                    System.out.print("31");
                    break;
                case 2:
                    System.out.print("28");
                    break;
                case 3:
                    System.out.print("31");
                    break;
                case 4:
                    System.out.print("30");
                    break;
                case 5:
                    System.out.print("31");
                    break;
                case 6:
                    System.out.print("30");
                    break;
                case 7:
                    System.out.print("31");
                    break;
                case 8:
                    System.out.print("31");
                    break;
                case 9:
                    System.out.print("30");
                    break;
                case 10:
                    System.out.print("31");
                    break;
                case 11:
                    System.out.print("30");
                    break;
                case 12:
                    System.out.print("31");
                    break;
                default:
                    System.out.println("1 ~ 12 사이의 정수만 입력하시오.");
            }
        }

    }

}
