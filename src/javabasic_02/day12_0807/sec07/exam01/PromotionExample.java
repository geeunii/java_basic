package javabasic_02.day12_0807.sec07.exam01;

class A {
}

class B extends A {
}

class C extends A {
}

class D extends B {
}

class E extends C {
}

public class PromotionExample {

    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b; // 상속관계이므로 b 객체변수에 저장된 주소값은 부모인 A 타입의 a1에 할당할 수 있다.
        A a2 = c; // 이하 동일. Is-a 관계 -> 앞은 자식 뒤는 부모
        A a3 = d;
        A e4 = e;

        B b1 = d;
        // B b2 = e; // 상속관계가 아니다.

        C c1 = e;
    }
}