package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int evenCnt = 0;
        int oddCnt = 0;

        for(int i = 1; i <= 10; i++) {
            int num = sc.nextInt();

            if (num % 2 == 0) {
                evenCnt++;
            } else {
                oddCnt++;
            }
        }

        System.out.println("even : " + evenCnt);
        System.out.println("odd : " + oddCnt);

    }

}
