package javabasic_01.day05_0729.forEx;

public class StartEx05 {

    public static void main(String[] args) {

        // 5. 오른쪽 역 삼각형 별 찍기
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("_");
            }

            for (int k = 0; k < 5 - i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
