package jungol.배열2;

import java.util.Scanner;

public class 배열2_형성평가1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 주사위를 10번 던져서 각 숫자가 몇 번씩 나왔는지 알아보려고 한다.
        // 한번 던질 때마다 나온 주사위의 숫자를 입력받아서
        // 각 숫자가 몇 번씩 나왔는지 출력하는 프로그램을 작성하시오.

        int[] cnt = new int[7];

        for (int i = 1; i <= 10; i++) {
            int n = sc.nextInt();

            if (n >= 1 || n <= 6) {
                cnt[n]++;
            }

        }

        for (int i = 1; i <= 6; i++) {
            System.out.printf("%d : %d\n", i, cnt[i]);
        }


    }
}
