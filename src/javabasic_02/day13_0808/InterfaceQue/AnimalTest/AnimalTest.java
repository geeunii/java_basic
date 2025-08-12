package javabasic_02.day13_0808.InterfaceQue.AnimalTest;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);  // Animal 타입에서는 fly를 호출할 수 없으므로.

        // `if`문이 실행될 때
        if (cheatableChicken instanceof Chicken) { // cheatableChicken은 Chicken 타입이므로 true
            cheatableChicken.fly(); // fly() 호출 -> speed가 2배가 됨
        }

//        if (chicken instanceof Cheatable) {
//            cheatableChicken.fly();
//        }

        for (int i = 0; i < 3; i++) {
            dog.run(1);
            chicken.run(1);
            cheatableChicken.run(1);

            System.out.println((i + 1) + "시간 후");
            System.out.println("개의 이동거리 = " + dog.distance);
            System.out.println("닭의 이동거리 = " + chicken.distance);
            System.out.println("날으는 닭의 이동거리 = " + cheatableChicken.distance);
        }
    }
}












