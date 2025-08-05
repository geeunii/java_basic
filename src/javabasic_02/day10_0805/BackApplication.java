package javabasic_02.day10_0805;

import java.util.Scanner;

public class BackApplication {
    static Scanner sc = new Scanner(System.in);
    static Account[] accounts = new Account[100];
    static int accountCnt = 0;
    static boolean run = true;

    // 1. 계좌생성 기능 --- private static void createAccount()
    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");

        System.out.print("계좌번호: ");
        String accountNo = sc.nextLine();

        System.out.print("계좌주: ");
        String owner = sc.nextLine();

        System.out.print("초기입금액: ");
        int balance = Integer.parseInt(sc.nextLine());

        Account newAccount = new Account(accountNo, owner, balance);
        accounts[accountCnt] = newAccount;
        accountCnt++;

        System.out.println("결과: 계좌가 생성되었습니다.");

    }

    // 2. 계좌목록 보기 기능 - private static void accountList()
    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

        for (int i = 0; i < accountCnt; i++) {
            System.out.printf("%s\t%s\t%d",
                    accounts[i].getAccountNum(), accounts[i].getOwner(), accounts[i].getBalance());
            System.out.println();
        }

    }

    // 3. 예금 기능 - private static void deposit()
    private static void deposit() {
        System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");

        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();

        System.out.print("예금액: ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accountCnt; i++) {
            if (accountNum.equals(accounts[i].getAccountNum())) {
                accounts[i].addBalance(balance);
            }
        }

        System.out.println("결과: 예금이 성공되었습니다.");
    }

    // 4. 출금 기능 - private static void withdraw()
    private static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");

        System.out.print("계좌번호: ");
        String accountNum = sc.nextLine();

        System.out.print("출금액: ");
        int balance = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < accountCnt; i++) {
            if (accountNum.equals(accounts[i].getAccountNum())) {
                while (balance > accounts[i].getBalance()) {
                    System.out.println("잘못된 금액 입력입니다.");
                    balance = Integer.parseInt(sc.nextLine());
                }
                accounts[i].minusBalance(balance);
            }
        }

        System.out.println("결과: 출금이 성공되었습니다.");
    }

    // 5. 프로그램 종료 - private static void exitApp()
    private static void exitApp() {
        run = false;
    }
    // Bank Application 시작 - amin()

    public static void main(String[] args) {

        while (run) {
            String menu = """
                    ===============================================
                    1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
                    ===============================================
                    """;
            System.out.print(menu);
            System.out.print("선택> ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> accountList();
                case 3 -> deposit();
                case 4 -> withdraw();
                case 5 -> exitApp();

            }

        }
        System.out.println("프로그램을 종료합니다.");
    }


}
