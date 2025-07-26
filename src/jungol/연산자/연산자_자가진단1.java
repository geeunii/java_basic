package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int sum = 0;
        int avg = 0;

        sum = x + y + z;
        avg = sum / 3;

        System.out.println("sum : " + sum);
        System.out.println("avg : " + avg);

    }

}
