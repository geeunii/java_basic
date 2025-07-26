package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int width = sc.nextInt();
        int length = sc.nextInt();

        width += 5;
        length *= 2;

        int area = width * length;

        System.out.printf("width = %d \nlength = %d \narea = %d", width, length, area);


    }
}
