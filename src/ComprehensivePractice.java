import java.util.LinkedHashMap;
import java.util.Scanner;

public class ComprehensivePractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = sc.nextLine();

        boolean system = true;

        while (system) {
            // 메인 메뉴
            System.out.print("""
                    ***************************************************
                    \t\tWelcome to Shopping Mall\t\t
                    \t\tWelcome to Book Market\t\t
                    ***************************************************
                     1. 고객 정보 확인하기      4. 바구니에 항목 추가하기   
                     2. 장바구니 상품 목록보기   5. 장바구니의 항목 수량 줄이기
                     3. 장바구니 비우기         6. 장바구니의 항목 삭제하기
                     7. 영수증 표시하기         8. 종료
                    ***************************************************
                    """);
            System.out.print("메뉴 번호를 선택해주세요 ");
            int menuNumber = sc.nextInt();
            // 1. 고객 정보 확인 및 8. 종료
            switch (menuNumber) {
                case 1:
                    System.out.println("현재 고객 정보 : ");
                    System.out.println("이름 " + userName + "    연락처 " + userMobile);
                    break;
                case 8:
                    system = false;
                    System.out.println("종료합니다.");
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
            }
        }


    }
}
