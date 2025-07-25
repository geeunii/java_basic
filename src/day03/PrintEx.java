package day03;

public class PrintEx {
    public static void main(String[] args) {

        System.out.printf("과목명: %s \n", "자바");
        System.out.printf("과목명: %1s 이름: %2$s\n", "자바", "김형근");
        System.out.printf("과목명: %3s 이름: %2$s 학번: %3$s\n", "자바", "김형근", "1234");

        // 정수 123을 출력
        System.out.printf("%d \n", 123);

        // 정수 ___123을 출력하고 싶다. 6자리 정수 출력. 왼쪽 빈자리 공백
        System.out.printf("%6d \n", 123);
        // 정수 ___123을 출력하고 싶다. 6자리 정수 출력. 오른쪽 빈자리 공백
        System.out.printf("%-6d \n", 123);
        //정수 000123을 출력하고 싶다. 6자리 정수 출력. 왼쪽 빈자리 0으로 채워라
        System.out.printf("%06d \n", 123);

        System.out.println("==========실수 표현=========");

        // 정수 7자리 + 소수점 + 소수2자리 . 왼쪽 빈자리 공백, 소수점도 카운팅 해야함
        // 반올림은 기본 defalut 값
        // ex) ____123.45
        System.out.printf("%10.2f \n", 123.45);
        System.out.printf("%10.2f \n", 123.453);
        System.out.printf("%10.2f \n", 123.456);

        // 정수 7자리 + 소수점 + 소수2자리 . 왼쪽 빈자리 0, 소수점도 카운팅 해야함
        System.out.printf("%010.2f \n", 123.45);

        System.out.println("==========문자열 표현=========");

        //문자열은 %s format / abc 출력
        System.out.printf("%s\n", "abc");

        //문자열은 %s format / ___abc 출력
        System.out.printf("%6s\n", "abc");

    }
}
