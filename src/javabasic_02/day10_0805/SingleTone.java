package javabasic_02.day10_0805;

public class SingleTone {
    // 싱글톤 클래스 객체를 담을 인스턴스 변수
    private static SingleTone instance;

    // 생성자를 private 선언 (외부 new 못하게)
    private SingleTone() {

    }

    public static SingleTone getInstance() {
        if (instance == null) {
            instance = new SingleTone();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTone st1 = SingleTone.getInstance();
        SingleTone st2 = SingleTone.getInstance();
        SingleTone st3 = SingleTone.getInstance();

        System.out.println(st1.toString()); // 주소값 비교 .toString()
        System.out.println(st2.toString());
        System.out.println(st3.toString());

        System.out.println(st1 == st2); // 주소값 동일한지 비교
        System.out.println(st1 == st3);
        System.out.println(st2 == st3);
    }
}
