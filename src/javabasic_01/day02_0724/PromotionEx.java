package javabasic_01.day02_0724;

public class PromotionEx {
    public static void main(String[] args) {

        //byte < short, char < int < long < float < double

        byte byteValue = 10;
        int intValue = byteValue; //자동타입 변환

        long longValue = 500000000L; // long 리터럴
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        double d1 = 5e2; // 5.0 x 10 x 10 = 500.0
        double d2 = 0.12E-2; //0.12 x 0.01 = 0.0012
        double d3 = 3.14;
        double d4 = 314e-2;

        System.out.println(d1 + " " + d2 + " " + d3 + " " + d4);

        float f1 = 3.14f;
        float f2 = 3E6F;
        System.out.println(f1 + " " + f2);

    }

}
