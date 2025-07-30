package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_자가진단5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. 정수를 입력받아서 3의 배수가 아닌 경우에는 아무 작업 하지 않음

        while (true) {
            int n = sc.nextInt();

            if (n % 3 != 0) {

            } else if (n % 3 == 0) { // 2. 3의 배수인 경우에는 3으로 나눈 몫을 출력하는 작업 반복
                System.out.println(n / 3);
            }

            if (n == -1) {
                break;
            }
        }

    }
}
