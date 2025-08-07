package javabasic_02.day12_0807.InheritanceTest;

public abstract class CheckingAccount extends Account{
    private String cardNo;

    public CheckingAccount(String accId, long balance, String ownerName, String cardNo) {
        super(accId, balance, ownerName);
        this.cardNo = cardNo;
    }

    void pay(long amount, String cardNo) {
        this.cardNo = cardNo;
    }
}
