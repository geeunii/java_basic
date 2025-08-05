package javabasic_02.day10_0805_Q20;

import javabasic_02.day10_0805.Account;

import java.util.Scanner;

public class BankApplication {

    static Scanner sc = new Scanner(System.in);
    static Account[] account = new Account[100]; // 길이 100인 account[] 배열
    static boolean system = true;
    static int accountCnt = 0;

    // 메뉴
    public static void menu() {

        while (system) {
            String menu = """
                    ===============================================
                    1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
                    ===============================================
                    """;
            System.out.print(menu);
            System.out.print("선택 > ");

            int select;

            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다. 메뉴 번호를 숫자로 입력해주세요.");
                continue; // 다시 메뉴로 돌아가기
            }

            switch (select) {
                case 1 -> creatAccount();
                case 2 -> accountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> exitApp();
                default -> System.out.println("올바른 메뉴 번호를 선택해주세요.");
            }
        }
    }

    // 계좌 생성 creatAccount
    private static void creatAccount() {
        System.out.print("""
                ----------
                계좌생성
                ----------
                """);

        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();

        System.out.print("계좌주: ");
        String owner = sc.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(sc.nextLine());

        Account newAccount = new Account(accountNum, owner, balance);
        account[accountCnt] = newAccount;
        accountCnt++;

        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    // 목록 accountList
    private static void accountList() {
        System.out.print("""
                ----------
                계좌목록
                ----------
                """);

        for (int i = 0; i < accountCnt; i++) {
            System.out.printf("%s\t%s\t%d", // 계좌목록
                    account[i].getAccountNum(), account[i].getOwner(), account[i].getBalance());
            System.out.println();
        }
    }

    // 예금 deposit
    private static void deposit() {
        System.out.print("""
                ----------
                예금
                ----------
                """);

        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();

        System.out.print("예금액: ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accountCnt; i++) {
            if (accountNum.equals(account[i].getAccountNum())) {
                account[i].addBalance(balance);
            }
        }

        System.out.println("결과: 예금이 성공되었습니다.");
    }

    // 출금 withdraw
    private static void withdraw() {
        System.out.print("""
                ----------
                출금
                ----------
                """);

        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();
        System.out.print("출금액: ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accountCnt; i++) {
            if (accountNum.equals(account[i].getAccountNum())) {
                account[i].minusBalance(balance);
            }
        }

        System.out.println("결과: 출금이 성공되었습니다.");
    }

    // 종료 exitApp
    private static void exitApp() {
        System.out.println("프로그램 종료");
        system = false;
    }

    public static void main(String[] args) {
        menu();
    }


}
