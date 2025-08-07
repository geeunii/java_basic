package javabasic_02.day12_0807.sec04.exam02;

public class SupersonicAirplane extends Airplane {
    //상수 선언
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;
    //상태 필드 선언
    public int flyMode = NORMAL;

    //메소드 재정의

    @Override
    public void fly() {
        if (flyMode == SUPERSONIC) {
            System.out.println("SUPERSNOCIM 모드로 비행합니다.");
        } else {
            System.out.println("일반모드로 주행합니다.");
        }

    }
}