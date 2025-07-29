package day05.whileEx;

public class ContinueEx01 {

    public static void main(String[] args) {

        // 1부터 10사이의 수 중 짝수만 출력하고 홀수인 경우 스킵
        // 반복으로 넘어가게 출력

        for(int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
            if(i % 2 != 0) {
                continue;
            }
            System.out.println("짝수 출력 : " + i);
        }

    }
}
