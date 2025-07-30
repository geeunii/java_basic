package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. 나라 이름 출력, 숫자를 입력받아 해당하는 나라의 수도를 출력하는 작업 반복
        // 2. 해당하는 번호 이외의 숫자가 입력되면 "none" 출력 후 프로그램 종료

        boolean country = true;
        while (country) {

            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");
            int number = sc.nextInt();
            System.out.println();

            switch (number) {
                case 1:
                    System.out.println("Seoul");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Washington");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Tokyo");
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Beijing");
                    System.out.println();
                    break;
                default:
                    country = false;
                    System.out.println("none");
                    break;
            }



        }


    }
}
