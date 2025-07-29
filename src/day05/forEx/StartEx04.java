package day05.forEx;

public class StartEx04 {

    public static void main(String[] args) {

        // 4. 역 삼각형 별 찍기
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

}
