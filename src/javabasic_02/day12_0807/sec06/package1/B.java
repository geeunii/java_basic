package javabasic_02.day12_0807.sec06.package1;

public class B {
    //메소드 선언
    public void method() {
        A a = new A(); // B라는 부품에 A라는 부품을 꽂았다.(인젝션)
        a.field = "Value";
        a.method();
    }

    public static void main(String[] args) {
        B b = new B();
        b.method();
    }
}