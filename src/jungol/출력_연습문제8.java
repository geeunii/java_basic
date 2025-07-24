package jungol;

public class 출력_연습문제8 {
    public static void main(String[] args) {

        String str1 = "korean";
        String str2 = "english";
        String str3 = "computer";

        int a = 90;
        int b = 100;
        int c = 80;

        System.out.println(" subject score");
        System.out.println("==============");
        System.out.printf("%8s, %5d\n", str1, a);
        System.out.printf("%8s, %5d\n", str2, b);
        System.out.printf("%s, %5d", str3, c);

    }
}
