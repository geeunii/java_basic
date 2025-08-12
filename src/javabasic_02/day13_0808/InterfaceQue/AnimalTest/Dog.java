package javabasic_02.day13_0808.InterfaceQue.AnimalTest;

public class Dog extends Animal {

    Dog(int speed) {
        this.speed = speed;
    }

    @Override
    void run(int hours) {
        distance += (double) (speed * hours) / 2;
    }
}
