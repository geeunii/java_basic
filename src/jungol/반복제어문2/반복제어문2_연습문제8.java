package jungol.반복제어문2;

public class 반복제어문2_연습문제8 {

    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 4; j++) {
                System.out.printf("%d * %d = %2d   ", j, i, i * j);
            }
            System.out.println();
        }


    }
}
