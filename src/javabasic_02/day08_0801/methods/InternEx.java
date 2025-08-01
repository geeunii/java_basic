package javabasic_02.day08_0801.methods;

public class InternEx {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String(new char[]{'H', 'e', 'l', 'l', 'o'}).intern();


        System.out.println(str1 == str2);
        // 해당 코드의 의미는?

        String str3 = "Hi";
        String str4 = new String("Hi");

        str3 = str3.intern();
        System.out.println(str4 == str3);
    }
}
