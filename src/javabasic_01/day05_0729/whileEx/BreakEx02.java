package javabasic_01.day05_0729.whileEx;

public class BreakEx02 {

    public static void main(String[] args) {

        Outter:
        for(char upper = 'A'; upper <= 'Z'; upper++) {
            for(char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + " - " + lower);
                if(lower == 'k') {
                    break Outter;
                }
            }
        }
        System.out.println("프로그램 종료");



    }
}
