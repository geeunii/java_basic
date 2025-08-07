package javabasic_02.day12_0807.InheritanceTest;

public class Tv {
    String color;
    boolean power;
    int channel;

    Tv() {
        color = "black";
        power = false;
        channel = 0;
    }

    void power() {
        power = true;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }

    void print() {
        System.out.printf("color :%s\t\tpower:%b\t\tchannel:%d\n", color, power, channel);
    }
}
