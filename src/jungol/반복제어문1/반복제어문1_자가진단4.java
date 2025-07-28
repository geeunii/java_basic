package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int num = sc.nextInt();

            sum += num;
            count++;

            if (num >= 100) break;
        }

        double avg = (double) sum / count;
        System.out.println(sum);
        System.out.printf("%.1f", avg);
    }
}
