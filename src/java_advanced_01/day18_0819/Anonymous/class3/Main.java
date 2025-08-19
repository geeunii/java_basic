package java_advanced_01.day18_0819.Anonymous.class3;

class Animal {
    public String eat() {
        return "먹는다.";
    }
}


public class Main {

    public static void main(String[] args) {

        Animal dog = new Animal() {
            @Override
            public String eat() {
                String run = run();  // 내부에서 호출 가능.
                return "강아지 멍멍 " + run;
            }

            public String run() {
                return "강아지 뜀";
            }
        };

        String eat = dog.eat();
        System.out.println(eat);
        // dog.run();

    }

}
