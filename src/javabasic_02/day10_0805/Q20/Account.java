package javabasic_02.day10_0805.Q20;

public class Account {
    public static final int MIN_BALANCE = 0;        // 상수 최소 0원
    public static final int MAX_BALANCE = 1000000;  // 상수 최대 100만원

    private int balance;                     // 통장 잔고
    private String accountNum;               // 계좌번호
    private String owner;                    // 계좌주

    public Account(int balance, String accountNum, String owner) { //Account 생성자
        this.balance = balance;
        this.accountNum = accountNum;
        this.owner = owner;
    }

    public void addBalance(int money) { // 금액 더하기
        if (money < MIN_BALANCE || MAX_BALANCE > 0) {
            return;
        }
        this.balance += money;
    }

    public void minusBalance(int money) { // 금액 빼기
        if (money < MIN_BALANCE || MAX_BALANCE > 0) {
            return;
        }
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }


    public String getAccountNum() { // 계좌번호
        return accountNum;
    }

    public String getOwner() {
        return owner;
    }
}
