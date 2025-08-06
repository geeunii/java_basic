package javabasic_02.day11_0806.MultilevelInheritance01;

public class Kitten extends Cat {
    void meow2() {
        System.out.println("새끼 고양이가 야옹하고 울다.");
    }

    public static void main(String[] args) {
        Kitten objKitten = new Kitten();

        objKitten.meow2();
        objKitten.meow();
        objKitten.eat();
    }
}
