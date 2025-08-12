package javabasic_02.day13_0808.InterfaceQue;

public abstract class Animal {
    int speed; // 속도
    double distance;   // 이동거리

    Animal() {

    }

    Animal(int speed) {
        this.speed = speed;
    }

    abstract void run(int hours);

    double getDistance() {
        return distance;
    }
}
