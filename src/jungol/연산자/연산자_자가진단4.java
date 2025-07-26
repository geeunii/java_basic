package jungol.연산자;

import java.util.Scanner;

public class 연산자_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int z = (x++) * (--y);

        System.out.printf("%d %d %d", x, y, z);

    }

}
