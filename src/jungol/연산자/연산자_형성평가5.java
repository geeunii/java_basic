package jungol.연산자;

import java.util.Scanner;

public class 연산자_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m_height = sc.nextInt();
        int m_weight = sc.nextInt();

        int k_height = sc.nextInt();
        int k_weight = sc.nextInt();

        boolean result = (m_height > k_height) && (m_weight > k_weight);

        System.out.println(result);

    }
}
