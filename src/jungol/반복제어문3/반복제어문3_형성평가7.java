package jungol.반복제어문3;

import java.util.Scanner;

public class 반복제어문3_형성평가7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n행 입력

        char a = 65;
        int num = 0;

        for (int i = 1; i <= n; i++) { // n개의 행
            for (int j = n + 1; j > 1; j--) { // n개의 열

                if (j <= i) {
                    System.out.print(num + " ");
                    num++;
                } else {
                    System.out.print(a + " ");
                    a++;
                }
            }

            System.out.println();
        }


    }
}
