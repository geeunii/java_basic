package javabasic_02.day13_0808.Afternoon.sec1;

public class User1 {

    public static void main(String[] args) {
        RemoteControl remoteControl = new SmartTelevision();
        remoteControl.turnOn();
        remoteControl.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");
    }
}
