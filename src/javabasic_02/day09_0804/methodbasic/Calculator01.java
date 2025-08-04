package javabasic_02.day09_0804.methodbasic;

import java.util.Scanner;

public class Calculator01 {
    // 입력기능을 위한 Scanner 기능 static 선언
    static Scanner sc = new Scanner(System.in);


    // main 메서드
    public static void main(String[] args) {
        // 사용자에게 한 줄로 원하는 데이터를 입력받기     5 2 1
        menu();
        String inputData = sc.nextLine();
        int[] fixData = inputDataPro(inputData);
        adder(fixData);
        minus(fixData);
        multi(fixData);
        div(fixData);
    }


    // 사용자 입력 데이터 처리 기능 : public static String[] inputDataPro(String inputData)
    public static int[] inputDataPro(String inputData) {
        String[] splitData = inputData.split(" ");
        int data1 = Integer.parseInt(splitData[0]);
        int data2 = Integer.parseInt(splitData[1]);
        int data3 = Integer.parseInt(splitData[2]);

        int[] datas = new int[]{
                data1, data2, data3
        };

        return datas;
    }


    // menu 기능 : public static void menu()
    public static void menu() {
        while (true) {
            System.out.println(
                    """
                    ================================================
                                    사칙연산 계산기        
                    =================================================
                    1. 덧셈   2. 뺄셈   3. 곱셈   4. 나눗셈  5. 프로그램 종료
                    
                    두 수를 차례로 입력하고 수행할 사칙연산의 메뉴 숫자를 입력해 주세요.
                    """);
        }
    }


    // 사칙연산 기능 : 반환값이 있는 메서드로.
    public static void adder(int[] datas) {
        System.out.println(datas[0] + datas[1]);
    }

    public static void minus(int[] datas) {
        System.out.println(datas[0] - datas[1]);
    }

    public static void multi(int[] datas) {
        System.out.println(datas[0] * datas[1]);
    }

    public static void div(int[] datas) {
        try {
            System.out.println(datas[0] / datas[1]);
        } catch (Exception e) {
            System.out.println("0으로는 나누지 못함.");
        }
    }


}
