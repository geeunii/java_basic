package javabasic_02.day13_0808;

public interface Service {
    // 디폴트 메소드
    default void defaultMethod1() {
        System.out.println("default1()");
        defaultCommon();
    }

    default void defaultMethod2() {
        System.out.println("default2()");
        defaultCommon();
    }

    // private 메소드
    private void defaultCommon() {
        System.out.println("defaultMethod의 중복코드 A");
        System.out.println("defaultMethod의 중복코드 B");
    }

    // static(정적) 메소드
    static void staticMethod1() {
        System.out.println("staticMethod1() 코드");
        staticCommon();
    }

    static void staticMethod2() {
        System.out.println("staticMethod2() 코드");
        staticCommon();
    }

    // private static 메소드
    private static void staticCommon() {
        System.out.println("staticMethod의 중복코드 A");
        System.out.println("staticMethod의 중복코드 B");
    }
}
