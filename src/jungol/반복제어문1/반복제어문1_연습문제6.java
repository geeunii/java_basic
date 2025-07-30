package jungol.반복제어문1;

import java.util.Scanner;

public class 반복제어문1_연습문제6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        boolean system = true;

        while (system) {
            // 인터페이스
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");
            int number = sc.nextInt(); // 작업할 번호 선택
            System.out.println();

            switch (number) {
                case 1:
                    System.out.println("입력하기를 선택하였습니다.");
                    break;
                case 2:
                    System.out.println("출력하기를 선택하였습니다.");
                    break;
                case 3:
                    System.out.println("삭제하기를 선택하였습니다.");
                    break;
                case 4:
                    system = false;
                    System.out.println("끝내기를 선택하였습니다.");
                    break;
                default:
                    System.out.println("잘못 입력하였습니다.");
                    break;
            }
        }


    }
}
