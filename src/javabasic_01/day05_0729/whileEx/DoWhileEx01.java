package javabasic_01.day05_0729.whileEx;

public class DoWhileEx01 {
    public static void main(String[] args) {

        int x = 20;
        int sum = 0;

        do {
            System.out.println("현재 x : " + x);
            sum += x;
            x--;
            System.out.println("처리 후 x, sum : " + x + ", " + sum);
        } while (10 <= x);
        System.out.println("---------------------");
        System.out.println("최종 sum : " + sum);

    }
}
