package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int result1 = (x == y) ? 1 : 0;
        int result2 = (x != y) ? 1 : 0;

        System.out.println(result1);
        System.out.println(result2);


    }

}
