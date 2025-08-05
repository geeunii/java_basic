package javabasic_02.day10_0805;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;

    private String accountNum;   // 계좌번호
    private String owner;       // 소유자
    private int balance;        // 통장 (입출금 내역 및 잔고확인)

    public String getAccountNum() {
        return accountNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // 은행에 가서 계좌개설신청하고 개인정보를 은행에 등록과정
    public Account(String accountNum, String owner, int balance) {
        this.accountNum = accountNum;
        this.owner = owner;
        this.balance = balance;
    }

    public void addBalance(int money) {

        if (money < MIN_BALANCE || money > MAX_BALANCE) {
            return;
        }
        this.balance += money;
    }

    public void minusBalance(int money) {

        if (money < MIN_BALANCE || money > MAX_BALANCE) {
            return;
        }
        this.balance -= money;
    }

    public int getBalance() {

        return this.balance;
    }

}
