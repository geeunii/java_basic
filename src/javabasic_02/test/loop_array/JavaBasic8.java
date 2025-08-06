package javabasic_02.test.loop_array;

import java.util.Scanner;

public class JavaBasic8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        boolean system = true;

        int balance = 0; // 잔고 설정

        while (system) {

            System.out.print("""
                    -----------------------------
                    1.예금 | 2.출금 | 3.잔고 | 4.종료
                    -----------------------------
                    """);

            System.out.print("선택> ");
            int number = Integer.parseInt(sc.nextLine()); // 사용자 선택 번호

            switch (number) {
                case 1:
                    System.out.print("예금액>");
                    int credit = Integer.parseInt(sc.nextLine());

                    balance += credit; // 예금액 누적

                    System.out.println();
                    break;
                case 2:
                    System.out.print("출금액>");
                    int withdraw = Integer.parseInt(sc.nextLine());

                    if (balance >= withdraw) {
                        balance -= withdraw; // 잔고에서 차감
                    }

                    System.out.println();
                    break;
                case 3:
                    System.out.print("잔고>" + balance);

                    System.out.println();
                    break;
                case 4:
                    system = false;
                    System.out.println();
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("올바르지 않은 키입력.");
                    break;
            }

        }

    }
}
