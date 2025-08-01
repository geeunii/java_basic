package jungol.배열1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 배열1_연습문제6_Re {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 10개의 자연수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램을 작성하시오.

        Integer[] outputArray = new Integer[10];
        for (int i = 0; i < outputArray.length; i++) {
            outputArray[i] = sc.nextInt();

        }

        Arrays.sort(outputArray, Collections.reverseOrder());
        System.out.println(outputArray[0]);

    }
}
