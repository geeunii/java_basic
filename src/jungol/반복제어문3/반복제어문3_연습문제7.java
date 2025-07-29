package jungol.반복제어문3;

public class 반복제어문3_연습문제7 {

    public static void main(String[] args) {

        // 4행 5열

        char a = 97;
        int num = 1;


        for (int i = 1; i <= 4; i++) { // 4행 선언

            for (int j = 1; j <= 5; j++) { // 열

                if (j <= i) {
                    System.out.print(a + " ");
                    a++;
                } else {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }


    }
}
