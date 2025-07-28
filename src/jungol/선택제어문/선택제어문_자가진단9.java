package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();


        if(x > y && z > y) {
            System.out.print(y);
        } else if (y > x && z > x) {
            System.out.print(x);
        } else {
            System.out.print(z);
        }

        int min = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z);
        System.out.println(min);
    }

}
