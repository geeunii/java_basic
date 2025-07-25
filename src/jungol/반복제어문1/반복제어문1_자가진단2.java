package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= x; i++) {
            sum += i;
        }

        System.out.println(sum);

    }
}
