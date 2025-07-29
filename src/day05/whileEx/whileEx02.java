package day05.whileEx;

public class whileEx02 {
    public static void main(String[] args) {
        // 1부터 100까지 합산하고 출력하는 프로그램 - while문을 이용

        int loop = 1;
        int sum = 0;

        while (loop <= 100) {
            sum += loop;
            loop++;
        }

        System.out.print(sum);
    }
}
