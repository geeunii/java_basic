package jungol.반복제어문2;

public class 반복제어문2_연습문제2 {

    public static void main(String[] args) {

        for(int i = 65; i <= 90; i++) {
            System.out.printf("%c", i);

        }

        System.out.println();

        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;

        }
        System.out.print(total);
    }

}
