package javabasic_02.day10_0805;

import java.util.Scanner;

public class BackApplication {
    static Scanner sc = new Scanner(System.in);

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
        System.out.println("결과: 계좌가 생성되었습니다.");

    }

    // 2. 계좌목록 보기 기능 - private static void accountList()
    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

    }
    // 3. 예금 기능 - private static void deposit()

    // 4. 출금 기능 - private static void withdraw()

    // 5. 프로그램 종료 - private static void exitApp()

    // Bank Application 시작 - amin()

    public static void main(String[] args) {
        boolean run = true;

        while (run) {
            String menu = """
                    ===============================================
                    1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료
                    ===============================================
                    """;
            System.out.println(menu);
            System.out.print("선택> ");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> createAccount();
                case 2 -> accountList();
                case 3 -> createAccount();
                case 4 -> createAccount();
                case 5 -> createAccount();

            }
            System.out.println("프로그램 종료합니다.");

        }
    }


}
