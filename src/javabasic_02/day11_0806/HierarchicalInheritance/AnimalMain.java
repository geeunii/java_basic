package javabasic_02.day11_0806.HierarchicalInheritance;

public class AnimalMain {
    public static void main(String[] args) {
        Cat objCat = new Cat();
        Dog objDog = new Dog();

        objCat.meow();
        objCat.eat();
        objDog.bark();
        objDog.eat();
    }
}
