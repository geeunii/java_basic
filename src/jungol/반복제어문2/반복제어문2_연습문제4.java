package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_연습문제4 {

    public static void main(String[] args) {

        // 자연수를 입력받아서 1부터 입력받은 수까지의 합을 출력하는 프로그램을 작성하시오.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 자연수 입력

        int sum = 0; // 합계 초기화

        for(int i = 1; i<=n; i++) { // 입력받은 수 까지의 합
            sum += i;
        }

        System.out.println(sum);
    }

}
