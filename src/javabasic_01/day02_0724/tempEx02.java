package javabasic_01.day02_0724;

public class tempEx02 {

    public static void main(String[] args) {

        int x, y, temp;

        x = 3;
        y = 5;
        temp = 0;

        System.out.printf("%d, %d, %d \n", x, y, temp);

        temp = x;
        x = y;
        y = temp;

        System.out.printf("%d, %d, %d \n", x, y, temp);
    }
}
