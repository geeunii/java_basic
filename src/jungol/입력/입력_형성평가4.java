package jungol.입력;

import java.util.Scanner;

public class 입력_형성평가4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int sum = x + y + z;

        System.out.printf("sum = %d", sum);
    }
}
