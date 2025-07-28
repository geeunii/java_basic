package jungol.반복제어문2;

import java.util.Scanner;

public class 반복제어문2_형성평가3 {
    public static void main(String[] args) {

        // 1부터 입력받은 정수까지의 5의 배수의 합
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        // 5의 배수 이니까 i는 5로 초기화 및 5씩 증가
        for (int i = 5; i <= num; i += 5) {
            sum += i;
        }

        System.out.println(sum);

    }
}
