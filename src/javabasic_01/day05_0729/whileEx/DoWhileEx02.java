package javabasic_01.day05_0729.whileEx;

import java.util.Scanner;

public class DoWhileEx02 {
    public static void main(String[] args) {

        System.out.println("메시지를 입력하세요. ");
        System.out.println("프로그램 종료 입력: exit");

        Scanner sc = new Scanner(System.in);
        String inputString;

        do {
            System.out.print("> ");
            inputString = sc.nextLine();
            System.out.println(inputString);

        } while (!inputString.equals("exit"));
        System.out.println("---------------------------");
        System.out.println("채팅 종료");
    }
}
