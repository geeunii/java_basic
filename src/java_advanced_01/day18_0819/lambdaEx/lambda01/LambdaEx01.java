package java_advanced_01.day18_0819.lambdaEx.lambda01;

public class LambdaEx01 {

    public static void main(String[] args) {

        action((x, y) -> {
            System.out.println(x + y);
        });

    }

    public static void action(Calculable calculable) {
        // 데이터 부
        int x = 10;
        int y = 2;
        calculable.calculate(x, y);
    }
}
