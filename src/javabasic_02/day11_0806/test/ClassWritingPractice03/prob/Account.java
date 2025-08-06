package javabasic_02.day11_0806.test.ClassWritingPractice03.prob;

public class Account {
    private String accNo; // 계좌번호
    private int balance; // 잔고

    // save
    public void save(int money) {
        balance += money;
        System.out.printf("%s 계좌에 %d만원이 입금되었습니다.\n", accNo, money);
    }

    // deposit
    public void deposit(int money) {
        balance -= money;
        System.out.printf("%s 계좌에 %d만원이 출금되었습니다.\n", accNo, money);
    }


    public Account() {

    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        System.out.printf("%s 계좌가 개설되었습니다.\n", accNo);
        this.accNo = accNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
