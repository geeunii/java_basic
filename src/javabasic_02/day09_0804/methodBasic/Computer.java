package javabasic_02.day09_0804.methodBasic;

public class Computer {
    public static int totalSum() {
        // 누적합 구하기 totalSum()
        int[] num = new int[6];
        int sum = 0;
        for (int i = 1; i < num.length; i++) {
            sum += i;
        }
        return sum;
    }
}
