package javabasic_02.day13_0808.Afternoon.sec3;

public class User1 {

    public static void main(String[] args) {
        Service service = new ServiceImpl();

        // 디폴트 메소드 호출
        System.out.println("======== 디폴트 메소드 호출 ========");
        service.defaultMethod1();
        service.defaultMethod2();

        System.out.println();

        // 정적 메소드 호출
        System.out.println("======== 정적 메소드 호출 ========");
        Service.staticMethod1();
        Service.staticMethod2();
    }
}
