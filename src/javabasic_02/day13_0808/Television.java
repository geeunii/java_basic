package javabasic_02.day13_0808;

public class Television implements RemoteControl {
    // 필드 volume 추가
    private int volume;

    // 필드 volume 은 볼륨버튼을 통해 음량을 조정할 수 있다.
    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("현재 TV 볼륨 : " + this.volume);
    }

    private int memoryVolume;   // mute 전 원래의 볼륨값

    @Override
    public void setMute(boolean mute) {
        if (mute) {
            this.memoryVolume = this.volume;    // 현재 볼륨 저장
            System.out.println("무음 처리 작동");
            setVolume(RemoteControl.MIN_VOLUME);
        } else {
            System.out.println("무음 해제");
            setVolume(this.memoryVolume);   // 저장했던 볼륨 넘기기
        }
    }

    @Override
    public void turnOn() {
        System.out.println("TV 전원 On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원 Off");
    }
}
