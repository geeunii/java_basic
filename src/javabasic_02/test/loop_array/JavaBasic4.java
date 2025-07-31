package javabasic_02.test.loop_array;

public class JavaBasic4 {
    public static void main(String[] args) {

        // 중첩 for문 방정식 4x + 5y = 60의 모든 해를 구하여
        // (x, y) 형태로 출력 x와 y는 10 이하의 자연수
        // 2차 방정식 ?


        for (int x = 1; x <= 10; x++) { // 행
            for (int y = 1; y <= 10; y++) {
                if ((4 * x) + (5 * y) == 60) {
                    System.out.printf("(%d, %d) ", x, y);
                }
            }
        }

    }
}
