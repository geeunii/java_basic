import java.util.Scanner;

public class 반복제어문2_연습문제5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt(); // 정수 10번 입력
            if (n % 2 == 0) {
                cnt++; // 짝수이면 카운트 증가
            }
        }

        System.out.printf("입력받은 짝수는 %d개입니다.", cnt);
    }
}
