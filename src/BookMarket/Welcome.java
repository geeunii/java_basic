package BookMarket;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;    // 책의 개수(NUM_BOOK)는 3개. 상수 선언. 변경 불가
    static final int NUM_ITEM = 7;
    // static 키워드는 이 배열이 객체 인스턴스가 아닌 클래스에 속하는 정적 변수

    static CartItem[] mCartItem = new CartItem[NUM_BOOK];
	// mCartItem 이라는 이름의 CartItem 객체 배열을 선언, NUM_BOOK 이라는 상수의 값(3)을 크기로 하는 CartItem 객체 배열을 새로 생성

    static int mCartCount = 0; // mCartCount 정수형 변수는 0으로 초기화.
    static User mUser;    // mUser 라는 이름의 User 타입 정적 변수를 선언

    public static void main(String[] args) {

        String[][] mBook = new String[NUM_BOOK][NUM_ITEM];	// 2차원 문자열 mBook 변수에 새로운 2차원 문자열 배열을 생성하여 할당

        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.next();

        System.out.print("연락처를 입력하세요 : ");
        int userMobile = input.nextInt();


        mUser = new User(userName, userMobile);	// User 클래스의 객체를 생성하여 입력받은 고객의 정보 저장

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market!";

        boolean quit = false;

        while (!quit) {
            System.out.println("***********************************************");
            System.out.println("\t" + greeting);
            System.out.println("\t" + tagline);

            menuIntroduction();

            System.out.print("메뉴 번호를 선택해주세요 ");
            int n = input.nextInt();

            if (n < 1 || n > 9) {
                System.out.println("1부터 9까지의 숫자를 입력하세요.");
            } else {
                switch (n) {

                    case 1:
                        menuGuestInfo(userName, userMobile);
                        break;
                    case 2:
                        menuCartItemList();
                        break;
                    case 3:
                        menuCartClear();
                        break;
                    case 4:
                        menuCartAddItem(mBook);
                        break;
                    case 5:
                        menuCartRemoveItemCount();
                        break;
                    case 6:
                        menuCartRemoveItem();
                        break;
                    case 7:
                        menuCartBill();
                        break;
                    case 8:
                        menuExit();
                        quit = true;
                        break;
                    case 9:
                        menuAdminLogin();
                        break;
                }
            }
        }

    }

    public static void menuIntroduction() {
        System.out.println("******************************");
        System.out.println(" 1. 고객 정보 확인하기  \t4. 바구니에 항목 추가하기");
        System.out.println(" 2. 장바구니 상품 목록 보기 \t5. 장바구니의 항목 수량 줄이기");
        System.out.println(" 3. 장바구니 비우기 \t\t6. 장바구니의 항목 삭제하기");
        System.out.println(" 7. 영수증 표시하기 \t\t8. 종료");
        System.out.println(" 9. 관리자 로그인");
        System.out.println("******************************");
    }

    public static void menuGuestInfo(String name, int mobile) {
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + mUser.getName() + "   연락처 " + mUser.getPhone());
    }

    public static void menuCartItemList() {
        System.out.println("장바구니 상품 목록 :");
        System.out.println("---------------------------------------");
        System.out.println("    도서ID \t|     수량 \t|      합계");
        for (int i = 0; i < mCartCount; i++) {
            System.out.print("    " + mCartItem[i].getBookID() + " \t| ");	// 책의 이름 출력
            System.out.print("    " + mCartItem[i].getQuantity() + " \t| ");	// 책의 수량 출력
            System.out.print("    " + mCartItem[i].getTotalPrice());	// 총 가격 출력
            System.out.println("  ");
        }
        System.out.println("---------------------------------------");
    }

    public static void menuCartClear() {
        System.out.println("장바구니 비우기");
    }

    // 장바구니에 도서 추가하기
    public static void menuCartAddItem(String[][] book) { // menuCartAddItem 메서드는 book 변수에 String 2차원 배열을 매개변수로 받음.

        BookList(book);    // BookList 라는 메서드를 호출하면서 book 이라는 변수를 매개변수로 전달 -> 메서드의 기능을 실행하라고 요청

        for (int i = 0; i < NUM_BOOK; i++) {    // 책의 수 : 행(row). 1차원.
            for (int j = 0; j < NUM_ITEM; j++)    // 책 정보 : 열(col). 2차원
                System.out.print(book[i][j] + " | ");    // 책 정보 표시
            System.out.println(" ");
        }
        boolean quit = false;    // 논리형 quit 변수 설정. false 로 초기화.

        while (!quit) {

            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();    // 도서의 ID를 입력.

            boolean flag = false;    // 논리형 flag 변수 설정. false 로 초기화.
            int numId = -1;    // 정수형 변수 numId = -1로 초기화.

            for (int i = 0; i < NUM_BOOK; i++) {    // NUM_BOOK 까지 i 값이 커지면서 반복을 함.
                if (str.equals(book[i][0])) {    // 변수 str 에 저장된 문자열이 book 배열의 특정 위치에 있는 문자열과 같은지 비교.
                    // 일치 한다면
                    numId = i;    // numId는 i를 할당받음.
                    flag = true;    // flag 변수를 true 로 할당
                    break;    // 스탑잇
                }
            }

            if (flag) { // 일치하는 책을 찾았을 때 (true)
                System.out.println("장바구니에 추가하겠습니까? Y | N ");
                str = input.nextLine();    // 추가 할지 안할지.

                if (str.toUpperCase().equals("Y")) {    // 입력받은 문자열을 모두 대문자 변환(toUpperCase()) -> y or Y 라면
                    System.out.println(book[numId][0] + " 도서가 장바구니에 추가되었습니다.");    // numId에 저장된 행 인덱스와 [0] 열에 있는 책 ID를 출력
                    // 장바구니에 넣기
                    if (!isCartInBook(book[numId][0]))    // 장바구니에 해당 책이 아직 없다면
                        mCartItem[mCartCount++] = new CartItem(book[numId]);
                    // 장바구니 배열 mCartItem 에 새로운 CartItem 객체를 생성하는 역할.
                    // mCartCount++를 통해 아이템을 넣은 후 자동으로 다음 칸으로 옮김.
                }
                quit = true;
            } else
                System.out.println("다시 입력해 주세요");    // 책 ID 가 목록에 없을 때.

        }
    }

    public static void menuCartRemoveItemCount() {
        System.out.println("5. 장바구니의 항목 수량 줄이기");
    }

    public static void menuCartRemoveItem() {
        System.out.println("6. 장바구니의 항목 삭제하기");
    }

    public static void menuCartBill() {
        System.out.println("7. 영수증 표시하기");
    }

    public static void menuExit() {
        System.out.println("8. 종료");
    }

    public static void BookList(String[][] book) {

        book[0][0] = "ISBN1234";
        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
        book[0][2] = "27000";
        book[0][3] = "송미영";
        book[0][4] = "단계별로 쇼핑몰을 구현하며 배우는 JSP 웹 프로그래밍 ";
        book[0][5] = "IT전문서";
        book[0][6] = "2018/10/08";

        book[1][0] = "ISBN1235";
        book[1][1] = "안드로이드 프로그래밍";
        book[1][2] = "33000";
        book[1][3] = "우재남";
        book[1][4] = "실습 단계별 명쾌한 멘토링!";
        book[1][5] = "IT전문서";
        book[1][6] = "2022/01/22";

        book[2][0] = "ISBN1236";
        book[2][1] = "스크래치";
        book[2][2] = "22000";
        book[2][3] = "고광일";
        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
        book[2][5] = "컴퓨터입문";
        book[2][6] = "2019/06/10";
    }

    public static boolean isCartInBook(String bookId) { // isCartInBook 메서드는 bookId 문자열 변수를 매개변수로 받고 있음.

        boolean flag = false;
        for (int i = 0; i < mCartCount; i++) {	// 장바구니에 있는 상품의 개수(mCartCount)만큼 반복
            if (bookId == mCartItem[i].getBookID()) {	// 장바구니에 담긴 각 상품(mCartItem[i])의 ID를 가져와서, 매개변수로 받은 bookId와 같은지 비교

                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
				// 일치하는 책을 찾으면, 그 책의 현재 수량(getQuantity())에 1을 더해서 다시 설정(setQuantity())

                flag = true; // 책을 찾았으니 true
            }
        }
        return flag; // 반환
    }

    public static void menuAdminLogin() {
        System.out.println("관리자 정보를 입력하세요");

        Scanner input = new Scanner(System.in);
        System.out.print("아이디 : ");
        String adminId = input.next();

        System.out.print("비밀번호 : ");
        String adminPW = input.next();

        Admin admin = new Admin(mUser.getName(), mUser.getPhone());
        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {
            System.out.println("이름 " + admin.getName() + "   연락처 " + admin.getPhone());
            System.out.println("아이디 " + admin.getId() + "   비밀번호 " + admin.getPassword());
        } else
            System.out.println("관리자 정보가 일치하지 않습니다.");
    }
}