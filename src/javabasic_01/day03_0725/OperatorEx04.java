package javabasic_01.day03_0725;

public class OperatorEx04 {

    public static void main(String[] args) {
        // 비트 이동 연산자
        int num1 = 1;
        int result1 = num1 << 3;
        //Math.pow(2, 3) => 2의 3제곱
        int result2 = num1 * (int) Math.pow(2, 3);
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);

        // 대입연산자, 복합대입연산자 +=, -=, *=, /=, %=
        int r = 0;
        r += 10; // r = r + 10;
        System.out.printf("현재 r의 값: %d \n", r);
        r -= 5; // r = r - 5;
        System.out.printf("현재 r의 값: %d \n", r);
        r *= 2; // r = r * 2;
        System.out.printf("현재 r의 값: %d \n", r);
        r /= 5; // r = r / 5;
        System.out.printf("현재 r의 값: %d \n", r);
        r %= 2; // r = r % 2;
        System.out.printf("현재 r의 값: %d \n", r);
        

        
    }
}
