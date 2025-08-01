package javabasic_02.day08_0801;

public class RefEx01 {

    public static void main(String[] args) {

        String refVar1 = null;
        String refVar2 = null;

        refVar1 = new String("자바");
        refVar2 = "자바";
        String refVar3 = "자바";
        String refVar4 = null; // 아직 인스턴스 되어 있지 않은 상태
        // 힙 안에 있는 객체를 할당받지 못한 상태.

        System.out.println(refVar1 == refVar2);
        System.out.println(refVar1 == refVar3);
        System.out.println(refVar2 == refVar3);
        System.out.println("-----------------");
        System.out.println(refVar1.equals(refVar2));
        System.out.println(refVar2.equals(refVar3));

        System.out.println("------NullPointerException");
        System.out.println(refVar4);
        System.out.println(refVar4.length());

    }
}
