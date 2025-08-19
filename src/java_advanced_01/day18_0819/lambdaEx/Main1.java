package java_advanced_01.day18_0819.lambdaEx;

public class Main1 {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Lambda");
            }
        };

        Runnable runnable1 = () -> System.out.println("Hello Lambda");

    }
}
