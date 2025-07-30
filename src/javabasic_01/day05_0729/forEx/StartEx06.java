package javabasic_01.day05_0729.forEx;

public class StartEx06 {

    public static void main(String[] args) {

        // 6. 피라미드 별 찍기
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("_");
            }

            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
