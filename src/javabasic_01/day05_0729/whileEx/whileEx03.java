package javabasic_01.day05_0729.whileEx;

import java.util.Scanner;

public class whileEx03 {
    public static void main(String[] args) {
        // 키보드 "1" 입력했을 때 속도 증가
        // "2" 를 입력하면 속도 감소
        // "3" 프로그램 종료
        // - while문을 이용

        // 1. 입력기능
        Scanner sc = new Scanner(System.in);

        // 2. 속도의 증감을 비교할 변수
        boolean run = true;

        // 3. 속도값 조절 변수
        int speed = 0;

        while (run) {
            System.out.println("-------------------------------------------");
            System.out.println("1. 속도 증가    |   2. 속도 감소    |   3. 종료");
            System.out.println("-------------------------------------------");
            System.out.print("선택하세요 : ");

            String strNum = sc.nextLine();

            // if 문으로 했을 시
            if (strNum.equals("1")) {
                speed++;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("2")) {
                speed--;
                System.out.println("현재 속도 = " + speed);
            } else if (strNum.equals("3")) {
                run = false;
                System.out.println("종료 합니다.");
            }

            // switch 문으로 했을 시
            switch (strNum) {
                case "1":
                    speed++;
                    System.out.println("현재 속도 = " + speed);
                    break;

                case "2":
                    speed--;
                    System.out.println("현재 속도 = " + speed);
                    break;

                case "3":
                    run = false;
                    System.out.println("종료 합니다.");
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");
            }


        }

        System.out.println("프로그램 종료");

    }
}
