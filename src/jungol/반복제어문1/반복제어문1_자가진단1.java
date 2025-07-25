package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단1 {

    public static void main(String[] args) {

        for(int i = 1; i <= 15; i++) {
            System.out.printf("%d ", i);

        }

        Scanner sc = new Scanner(System.in);

        char c = sc.next().charAt(0);

        for(int i = 1; i <= 20; i++) {
            System.out.printf("%c", c);
        }

    }
}
