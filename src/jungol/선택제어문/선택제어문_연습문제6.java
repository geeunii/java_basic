package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_연습문제6 {
    public static void main(String[] args) {
        // Math.max() 를 이용하여 풀기.

        System.out.print("세 수를 입력하세요. ");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int temp1 = Math.max(x, y);
        int temp2 = Math.max(y, z);

        int maxValue = Math.max(temp1, temp2);

        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", maxValue);
    }

}
