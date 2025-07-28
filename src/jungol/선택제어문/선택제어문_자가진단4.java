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
        }


    }

}
