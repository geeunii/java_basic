package jungol.연산자;

public class 연산자_연습문제8 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int c = 2;

        int result1 = (a != 0 || b != 0) ? 1 : 0;
        int result2 = (b != 0 && c != 0) ? 1 : 0;
        int result3 = (a != 0 && b != 0) ? 1 : 0;
        int result4 = a == 0 ? 1 : 0;

        System.out.printf("%1$d %2$d %3$d %4$d", result1, result2, result3, result4);
    }
}
