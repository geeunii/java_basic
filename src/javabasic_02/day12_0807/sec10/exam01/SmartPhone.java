package javabasic_02.day12_0807.sec10.exam01;

public class SmartPhone extends Phone  {
    //생성자 선언
    SmartPhone(String owner) {
        super(owner);
    }

    //메소드 선언
    void internet() {
        System.out.println("인터넷 사용함.");
    }

}