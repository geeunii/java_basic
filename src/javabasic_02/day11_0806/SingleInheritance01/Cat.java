package javabasic_02.day11_0806.SingleInheritance01;

public class Cat extends Animal {

    void meow() {
        System.out.println("야옹");
    }

    public static void main(String[] args) {

        Cat obj = new Cat();

        obj.meow();
        obj.eat();
    }

}
