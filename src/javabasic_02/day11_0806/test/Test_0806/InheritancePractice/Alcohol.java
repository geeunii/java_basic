package javabasic_02.day11_0806.test.Test_0806.InheritancePractice;

public class Alcohol extends Drink {
    private double alcper;

    public Alcohol(String name, int price, int count, double alcper) {
        super(name, price, count);
        this.alcper = alcper;
    }


    public static void printTitle() {  // 타이틀
        System.out.println("상품명(도수[%])\t단가\t\t수량\t\t금액");
    }

    @Override
    public void printData() {  // 상품의 정보
        System.out.printf("%s(%.1f)\t\t%d\t%d\t\t%d\n", this.name, this.alcper, this.price, this.count, getTotalPrice());
    }
}
