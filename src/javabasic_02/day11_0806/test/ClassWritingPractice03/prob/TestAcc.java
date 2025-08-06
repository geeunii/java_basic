package javabasic_02.day11_0806.test.ClassWritingPractice03.prob;

public class TestAcc {
    public static void main(String[] args) throws Exception {

        String accNo = null;
        int balance = 0;

        Account accObj = new Account(); // Account 클래스의 인스턴스(객체)이름은 ~(할당받기)이다. new(생성자) Account()형 인스턴스를 생성하겠다.
		accObj.setAccNo("078-3762-293");
        accNo = accObj.getAccNo();
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");

        accObj.save(100);
        balance = accObj.getBalance();
        System.out.println(accObj.getAccNo() + " 계좌의 잔고는 " + balance + "만원입니다.");

        accObj.deposit(30);
        balance = accObj.getBalance();
        System.out.println(accNo + " 계좌의 잔고는 " + balance + "만원입니다.");
    }

}
