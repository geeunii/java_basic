package javabasic_02.day13_0808.Afternoon.sec3;

public class User {

    public static void main(String[] args) {
        RemoteControl televisionControl = new Television();

        televisionControl.turnOn();

        System.out.println("============ 볼륨 체크 =======");
        televisionControl.setVolume(10);
        televisionControl.setVolume(11);

        System.out.println("========== 음소거 확인 ========");
        televisionControl.setMute(true);
        televisionControl.setMute(false);

        System.out.println("======================");
        RemoteControl.changeBattery();  // 정적 메소드 수행

        System.out.println("======================");
        // TV의 최대 볼륨 확인     public static final은 타입.상수명 바로 접근하여 상수값 읽음.
        System.out.println(RemoteControl.MAX_VOLUME); // 정적(static) 변수니까 클래스 이름으로 접근
        // TV의 최소 볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME); // 인스턴스가 아니니까.
    }
}
