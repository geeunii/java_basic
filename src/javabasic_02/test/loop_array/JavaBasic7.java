package javabasic_02.test.loop_array;

public class JavaBasic7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            for (int j = 3; j > i; j--) { // 공백
                System.out.print(" ");
            }

            for (int j = 1; j <= i * 2 - 1; j++) { // 위
                if (i * 2 - 1 <= 5) {
                    System.out.print("@");
                }
            }

            // 하단부

            System.out.println();
        }
    }
}
