package javabasic_02.day09_0804.methodbasic;

import java.util.Scanner;

public class Example05 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("사용자 아아디를 입력해 주세요. ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력해 주세요. ");
        String pwd = sc.nextLine();
        idPwPrint(id, pwd);
    }

    public static void idPwPrint(String id, String pwd) {
        System.out.println("id : " + id + " / " + "password : " + pwd);

    }
}
