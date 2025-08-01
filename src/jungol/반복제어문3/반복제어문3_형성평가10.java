package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가10 {
    public static void main(String[] args) {

        // 자연수 n을 입력받아 "출력 예"와 같이 n x n크기에 공백으로 구분하여 출력되는 프로그램을 작성하시오. 10 미만의 홀수만 출력하시오.
        // 주의! 숫자는 공백으로 구분하되 줄사이에 빈줄은 없다.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; i <= n; i++) { // n개의 행
            for (int j = 1; j <= n; j++) {
                System.out.print(num + " ");
                num += 2;
                if (num > 9) {
                    num = 1;
                }
            }


            System.out.println();
        }

    }
}
