package javabasic_02.day09_0804.methodBasic;

import java.util.Scanner;

public class ComputerMain {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = Computer.totalSum();
        System.out.println(sum);
    }
}
