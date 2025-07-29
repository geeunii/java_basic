package day05.forEx;

public class StartEx03 {

    public static void main(String[] args) {

        // 3. 오른쪽 삼각형 별 찍기
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }


    }

}
