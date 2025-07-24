package jungol.입력;

public class 입력_연습문제4 {
    public static void main(String[] args) {
        int a, b;
        a = 5;
        b = 2;

        double c, cir, area;
        c = 3.14d;
        cir = a * b * c;
        area = a * a * c;

        System.out.printf("원주 = %d * %d * %f = %f \n", a, b, c, cir);
        System.out.printf("넓이 = %d * %d * %f = %f", a, a, c, area);
    }
}
