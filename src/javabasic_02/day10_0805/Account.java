package javabasic_02.day10_0805;

public class Account {
    public static final int MIN_BALANCE = 0;
    public static final int MAX_BALANCE = 1000000;
    private int balance;    // 통장 (입출금 내역 및 잔고확인)

    public void setBalance(int money) {

        if (money < 0 || money > 1000000) {
            return;
        }
        this.balance += money;
    }

    public int getBalance() {

        return this.balance;
    }

    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println(account.balance);

        account.setBalance(200);
        System.out.println(account.balance);

    }

}
