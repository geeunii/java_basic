package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_자가진단4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 100 이하의 정수를 입력받아서 입력받은 정수부터 100까지의 합을 출력하는 프로그램을 작성하시오.
        int n = sc.nextInt();

        int sum = 0;

        if (n <= 100) {
            for (int i = n; n <= 100; n++) {
                sum += n;
            }
        }
        System.out.println(sum);

    }
}
