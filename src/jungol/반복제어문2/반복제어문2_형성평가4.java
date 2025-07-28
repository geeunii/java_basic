package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.printf("%.2f", (double) sum / n);
    }

}
