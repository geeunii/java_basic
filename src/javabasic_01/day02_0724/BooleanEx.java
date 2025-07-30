package javabasic_01.day02_0724;

public class BooleanEx {

    public static void main(String[] args) {

        boolean stop = true;
        if (stop) {
            System.out.println("Stop");
        } else {
            System.out.println("Go");
        }

        int x = 30;
        boolean result1 = (x == 20);
        boolean result2 = (x != 20);
        boolean result3 = (x > 0 && x < 30);
        boolean result4 = (x < 0 || x >= 30);

        System.out.println("A1. " + result1);
        System.out.println("A2. " + result2);
        System.out.println("A3. " + result3);
        System.out.println("A4. " + result4);

    }
}
