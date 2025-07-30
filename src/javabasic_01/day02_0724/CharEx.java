package javabasic_01.day02_0724;

public class CharEx {

    public static void main(String[] args) {

        char c1 = 'A';
        System.out.println(c1);
        char c2 = 65;
        System.out.println(c2);
        char c3 = ' '; // char 문자데이터 초기화 공백의 유니코드값 32로 한다. 공백필수' '

        char c4 ='가';
        char c5 = 44032; // '가'의 유니코드 값

        System.out.println(c4);
        System.out.println(c5);

        String v1 = "A";

        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
    }
}
