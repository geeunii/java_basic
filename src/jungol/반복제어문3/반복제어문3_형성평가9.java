package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가9 {
    public static void main(String[] args) {

        /*
        자연수 n을 입력받아 "출력 예"와 같이 공백으로 구분하여 출력되는 프로그램을 작성하시오.
        주의! '#'은 공백으로 구분하되 줄사이에 빈줄은 없다.
         */

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        // 아래쪽 역삼각형
        int space = 2;
        for (int i = n - 1; i >= 1; i--) {
            // 공백 출력
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            space += 2;

            // # 출력
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
