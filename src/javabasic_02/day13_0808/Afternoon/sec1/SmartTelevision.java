package javabasic_02.day13_0808.Afternoon.sec1;

public class SmartTelevision implements RemoteControl, Searchable {

    @Override
    public void turnOn() {
        System.out.println("TV 전원 On");
    }

    @Override
    public void turnOff() {
        System.out.println("TV 전원 Off");
    }

    @Override
    public void search(String url) {
        System.out.println(url + "검색합니다.");
    }
}
