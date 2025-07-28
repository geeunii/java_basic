package jungol.선택제어문;

import java.util.Scanner;

public class 선택제어문_자가진단6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 남자는 M, 여자는 F, 18세 이상 성인
        // 2. M, F 나이 입력 받고, 성인남자, 성인여자, 미성년남자, 미성년여자 구분 출력

        char gender = sc.next().charAt(0);
        int age = sc.nextInt();

        if (gender == 'M' && 18 <= age) {
            System.out.print("MAN");
        } else if (gender == 'M' && age < 18) {
            System.out.print("BOY");
        } else if (gender == 'F' && 18 <= age) {
            System.out.print("WOMAN");
        } else {
            System.out.print("GIRL");
        }


    }

}
