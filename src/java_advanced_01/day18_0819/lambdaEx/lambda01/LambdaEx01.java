package java_advanced_01.day18_0819.lambdaEx.lambda01;

import java.util.Scanner;

public class LambdaEx01 {
    // 사용자가 입력한 숫자 두개의 결과를 처리
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        action((x, y) -> {
            System.out.println(x + y);
        });

        action((x, y) -> {
            System.out.println(x - y);
        });

    }

    public static void action(Calculable calculable) {
        // 데이터 부
        System.out.println("num1: ");
        int x = sc.nextInt();
        System.out.println("num2: ");
        int y = sc.nextInt();
        calculable.calculate(x, y);
    }
}
