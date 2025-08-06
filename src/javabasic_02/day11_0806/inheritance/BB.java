package javabasic_02.day11_0806.inheritance;

public class BB extends AA {
    public int cc = 30;

    void adder() {
//        int result = super.aa + super.bb + this.cc;
        // int result = aa + bb + cc;
        int result = this.getAA() + bb + cc;
        System.out.println(result);
    }

    public static void main(String[] args) {
        BB b = new BB();
        System.out.println(b.getAA());
        b.adder();
        b.printAA();
    }
}
