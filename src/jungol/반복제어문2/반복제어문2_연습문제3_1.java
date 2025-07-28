package jungol.반복제어문2;

import java.util.stream.IntStream;

public class 반복제어문2_연습문제3_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                System.out.printf("%d ", i);
            }
        }

        System.out.println();
        System.out.println("람다 방식 ====================");

        IntStream intStream = IntStream.rangeClosed(1, 20);
        intStream.filter(n -> n % 2 == 1)
                .forEach(e -> System.out.print(e + " "));

    }

}
