package day03;

public class OperatorEx01 {
    public static void main(String[] args) {
        // 1. 부호 연산자 : 변수의 부호를 유지하거나 변경한다.
        byte b = 100;
        System.out.println(b);
        // 정수 타입 (byte, short, int)의 연산결과는 int 타입으로 저장해야함.
        int a = -b;
        System.out.println(a);

        int c = -a;
        System.out.println(c);

        // 2. 증감연산자 : 변수의 값을 1 증가시키거나 1 감소시킴.
        // ++x, --x -> prefix
        // x++, x-- -> postfix

        // ++x, x++ -> i = i + 1
        // --x, x-- -> i = i - 1

        int x = 1;
        int y = 1;

        int result1 = ++x + 10; // 12
        System.out.println(result1);

        int result2 = y++ + 10; // 11 -> 모든 연산 처리 후(= 할당 후) 후위 진행
        System.out.println(result2);
        System.out.println(y++ + 10); // 12

        int x1 = 10;
        int y1 = 10;
        int z;

        x1++; // x1 = x1 + 1
        ++x1; // x1 = x1 + 1
        System.out.println("x1 : " + x1);

        System.out.println("--------------");

        y1--;
        --y1;
        System.out.println("y1 : " + y1);

        System.out.println("--------------");

        z = x1++;
        System.out.println("z : " + z + " x1 : " + x1);

        System.out.println("--------------");

        z = ++x1 + y1++;
        System.out.println("z : " + z + " x1 : " + x1 + " y1 : " + y1);

        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        int result = totalPieces - number;
        System.out.println("10조각에서 남은 조각 : " + result);
        System.out.println("사과 1개에서 남은 양 : " + result/10.0);




    }
}
