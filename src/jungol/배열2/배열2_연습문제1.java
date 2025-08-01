package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1부터 10까지의 정수를 입력받다가
        // 입력된 정수가 범위를 벗어나면
        // 그 때까지 1번 이상 입력된 각 숫자의 개수를 작은 수부터 출력

        int[] count = new int[11]; // 1~10

        while (true) {
            int input = sc.nextInt(); // 정수 입력

            if (1 <= input && input <= 10) {
                count[input]++;
            } else {
                break;
            }

        }

        for (int i = 1; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.printf("%d : %d개\n", i, count[i]);
            }

        }

    }
}
