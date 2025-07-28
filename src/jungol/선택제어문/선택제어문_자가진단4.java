package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double weight = sc.nextDouble();
        /*
        50.80kg 이하를 Flyweight, 

        61.23kg 이하를 Lightweight, 

        72.57kg 이하를 Middleweight, 

        88.45kg 이하를 Cruiserweight, 

        88.45kg 초과를 Heavyweight
         */

        if(88.45 < weight) {
            System.out.println("Heavyweight");
        } else if (weight <= 88.45 && 72.57 < weight) {
            System.out.println("Cruiserweight");
        } else if (weight <= 72.57 && 61.23 < weight) {
            System.out.println("Middleweight");
        } else if (weight <= 61.23 && 50.80 < weight) {
            System.out.println("Lightweight");
        } else {
            System.out.println("Flyweight");
        }


    }

}
