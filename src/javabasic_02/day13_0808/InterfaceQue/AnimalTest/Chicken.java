package javabasic_02.day13_0808.InterfaceQue.AnimalTest;

public class Chicken extends Animal implements Cheatable {

    Chicken(int speed) {
        this.speed = speed;
    }

    @Override
    void run(int hours) {
        distance += (double) speed * hours;
    }

    @Override
    public void fly() {
        this.speed *= 2;
    }
}
