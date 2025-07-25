package jungol.입력;

import java.util.Scanner;

public class 입력_자가진단7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("%d * %d = %d\n", x, y, (x * y));
        System.out.printf("%d / %d = %d", x, y, (x / y));

    }
}
