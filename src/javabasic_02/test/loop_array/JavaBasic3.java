package javabasic_02.test.loop_array;

public class JavaBasic3 {

    public static void main(String[] args) {

        // While문, Math.random()메소드
        // 2개의 주사위 던져서 나오는 숫자 출력
        // 숫자의 합이 5가 아니면 계속 주사위
        // 합이 5이면 실행 멈춤

        while (true) {

            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);

            System.out.printf("%d, %d\n", dice1, dice2); // 숫자 출력

            if (dice1 + dice2 == 5) {
                break;
            }

        }

    }
}
