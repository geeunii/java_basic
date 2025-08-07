package javabasic_02.day12_0807.sec02;

public class Phone {
    //필드 선언 -> 변수라 하지말고 필드라 하기.
    public String model;
    public String color;

    public Phone() {
    }

    //메소드 선언
    public void bell() {
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String message) {
        System.out.println("자기: " + message);
    }

    public void receiveVoice(String message) {
        System.out.println("상대방: " + message);
    }

    public void hangUp() {
        System.out.println("전화를 끊습니다.");
    }
}