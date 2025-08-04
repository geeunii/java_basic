package javabasic_02.day09_0804;

public class Example02 {

    public static String greeting() {
        String greeting = "Hello";
        return greeting;
    }

    public static void main(String[] args) {
        String str = greeting();
        System.out.println(str);
        System.out.println(str + " Java");


        System.out.println(greeting() + " 자바 프로그래밍");
    }

}
