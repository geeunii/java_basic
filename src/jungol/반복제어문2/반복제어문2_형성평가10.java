package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        if((2 <= x && x <= 9) && (2 <= y && y <= 9)) {

            for(int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d =  %d\n", x, i, x * i);
            } for(int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d =  %d\n", y, j, y * j);
            }
            System.out.println();

        }


    }

}
