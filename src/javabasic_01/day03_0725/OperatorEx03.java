package javabasic_01.day03_0725;

public class OperatorEx03 {

    public static void main(String[] args) {

        // 논리연산자: 논리곱(&&), 논리합(||), 배타적논리합(^), 논리부정(!) 연산 수행

        int charCode = 'A';
        if ((65 <= charCode) && (charCode <= 90)) {
            System.out.println("알파벳 대문자 입니다.");
        }

        if ((97 <= charCode) && (charCode <= 122)) {
            System.out.println("알파벳 소문자 입니다.");
        }

        charCode = '5';
        if ((48 <= charCode) && (charCode <= 57)) {
            System.out.println("0-9 사이의 숫자 입니다.");
        }


        // 2의 배수 또는 3의 배수 인지 검사하는 수식 구하기
        int value = 6;
        if((value % 2 == 0) || (value %3 == 0)) {
            System.out.println("2 또는 3의 배수 입니다.");
        }


        value = 7;
        boolean result = (value % 2 == 0) || (value %3 == 0);
        if(!result) {
            System.out.println("2 or 3의 배수가 아님.");
        }
    }
}
