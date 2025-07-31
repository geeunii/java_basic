import java.util.Scanner;

public class 반복제어문3_형성평가5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 줄 수 입력

        for (int i = 1; i <= n; i++) {
            // 공백 출력 (오른쪽 정렬을 위한)
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // 공백 2칸 (별 사이 간격 때문)
            }

            // 별 출력 (홀수 개씩 증가)
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
