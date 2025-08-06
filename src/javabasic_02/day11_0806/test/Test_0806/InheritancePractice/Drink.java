package javabasic_02.day11_0806.test.Test_0806.InheritancePractice;

public class Drink {
    protected String name; // 상품명
    protected int price;   // 단가
    protected int count;   // 수량

    public Drink(String name, int price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public int getTotalPrice() {    // 금액(단가*수량)
        return price * count;
    }

    public static void printTitle() {  // 타이틀
        System.out.println("상품명\t단가\t\t수량\t\t금액");
    }

    public void printData() {  // 상품의 정보
        System.out.printf("%s\t\t%d\t%d\t\t%d\n", this.name, this.price, this.count, getTotalPrice());
    }
}
