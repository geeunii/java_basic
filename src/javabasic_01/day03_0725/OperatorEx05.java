package javabasic_01.day03_0725;

import java.util.Scanner;

public class OperatorEx05 {

    public static void main(String[] args) {
        // 삼항 연산자 (피연산자 ? 피연산자 : 피연산자)
        // 조건식 ? 값 또는 연산식(true) : 값 또는 연산식(false)

        Scanner sc = new Scanner(System.in);
        System.out.println("국어 점수를 입력하세요.");
        int kor = sc.nextInt();

        char grade = (kor > 90) ? 'A' : (kor > 80) ? 'B' : 'C';

        System.out.println(grade);
        // if문으로 처리할시.
        if(kor > 90) {
            System.out.println('A');
        } else if(kor > 80) {
            System.out.println('B');
        } else {
            System.out.println('C');
        }
    }
}
