package javabasic_01.day05_0729.forEx;

public class StartEx02 {

    public static void main(String[] args) {

        // 2. 왼쪽 삼각형 별 찍기
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
