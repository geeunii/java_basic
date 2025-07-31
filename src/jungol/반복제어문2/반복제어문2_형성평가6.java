package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        int sum = 0;
        int cnt = 0;

        for (int i = start; i <= end; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;

        System.out.printf("sum : %d\n", sum);
        System.out.printf("avg : %.1f", avg);
    }

}
