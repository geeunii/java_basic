package jungol.배열2;

import java.util.Scanner;

public class 배열2_연습문제2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 정수를 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
        // 그 때까지 입력된 정수의 일의 자리 숫자가 각각 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)

        int[] count = new int[10]; // 일의 자리 갯수

        while (true) {
            int input = sc.nextInt(); // 정수 입력

            if (input == 0) { // 0이 입력되면 종료
                break;
            }

            int ones = input % 10; // 일의 자리 추출
            count[ones]++;

        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) {
                System.out.printf("%d : %d개\n", i, count[i]);
            }

        }

    }
}
