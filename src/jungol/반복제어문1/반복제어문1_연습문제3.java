package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("점수를 입력하세요. ");
            int score = sc.nextInt(); // 점수 입력

            if(80 <= score && 100 >= score) {
                System.out.println("축하합니다. 합격입니다.");
            } else if (80 > score && 0 <= score) {
                System.out.println("죄송합니다. 불합격입니다.");
            }

            if(score > 100 || score < 0) break;

        }


    }
}
