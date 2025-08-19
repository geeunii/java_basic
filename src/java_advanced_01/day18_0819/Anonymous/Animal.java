package java_advanced_01.day18_0819.Anonymous;

public class Animal {

    public String eat() {
        return "먹는다.";
    }

    public class Main {

        public void main(String[] args) {

            Animal dog = new Animal() {
                @Override
                public String eat() {
                    return "강아지가 먹는다.";
                }
            };

        }

    }

}