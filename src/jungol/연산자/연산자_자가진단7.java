package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean result1 = (x != 0) && (y != 0);
        boolean result2 = (x != 0) || (y != 0);

        System.out.print(result1 + " " + result2);

    }

}
