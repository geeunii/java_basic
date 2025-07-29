package jungol.반복제어문3;

public class 반복제어문3_연습문제5_1 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // 피라미드의 행

            for (int j = 5; j > i; j--) { // 공백
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) { // 피라미드 별
                System.out.print("*");
            }

            System.out.println();
        }


    }
}
