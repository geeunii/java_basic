package jungol.배열1;

import java.util.Scanner;

public class 배열1_연습문제5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 1. 연도와 월을 입력받기
        // 2. 해당 월의 날 수를 출려력하다가 월이 0이 되면 종료
        // 3. 월이 잘못 입력되면 잘못 입력됐다고 출력

        int[] month = new int[12];

        int i;
        for (i = 0; i < month.length; i++) {
            int year = sc.nextInt();
            month[i] = sc.nextInt();
        }


    }
}
