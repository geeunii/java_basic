package day04;

import java.util.Scanner;

public class ForEx02 {

    public static void main(String[] args) {

        // 1 부터 10까지 더한 값

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        System.out.println("출력: " + sum);

    }
}
