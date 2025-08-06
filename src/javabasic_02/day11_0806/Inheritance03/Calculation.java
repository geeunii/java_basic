package javabasic_02.day11_0806.Inheritance03;

public class Calculation {

    int a = 20;
    int b = 10;

    void addition() {
        System.out.println("두 수의 덧셈 : " + (a + b));
    }

    void subtraction() {
        System.out.println("두 수의 뺄셈 : " + (a - b));
    }

    int getA() {
        this.addition();
        return 0;
    }

    int getB() {
        this.subtraction();
        return 0;
    }
}
