package java_advanced_01.day18_0819.Anonymous.class4;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        Calculator calculator = new Calculator(number1, number2);

        int result = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        });

        int result1 = calculator.calculate(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a - b;
            }
        });

        System.out.println(result);
        System.out.println(result1);
    }

}
