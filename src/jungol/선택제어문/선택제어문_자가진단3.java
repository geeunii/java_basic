package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        int i = 20;

        if(i <= age) {
            System.out.println("adult");
        } else {
            i = 20 - age;
            System.out.printf("%d years later", i);
        }

    }

}
