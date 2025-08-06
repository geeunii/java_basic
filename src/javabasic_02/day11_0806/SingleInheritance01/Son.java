package javabasic_02.day11_0806.SingleInheritance01;

public class Son extends Father {

    void name() {
        System.out.println("나의 이름은 홍길동");
    }

    public static void main(String[] args) {
        Son obj = new Son();

        obj.name();
        obj.familyName();
        obj.houseAddress();
    }

}
