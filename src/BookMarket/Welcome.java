package BookMarket;

import java.util.Scanner;

public class Welcome {
    static final int NUM_BOOK = 3;    // 책의 개수(NUM_BOOK)는 3개. 상수 선언. 변경 불가
    static final int NUM_ITEM = 7;
    // static 키워드는 이 배열이 객체 인스턴스가 아닌 클래스에 속하는 정적 변수

    // static CartItem[] mCartItem = new CartItem[NUM_BOOK];
    // mCartItem 이라는 이름의 CartItem 객체 배열을 선언, NUM_BOOK 이라는 상수의 값(3)을 크기로 하는 CartItem 객체 배열을 새로 생성

    static int mCartCount = 0; // mCartCount 정수형 변수는 0으로 초기화.
    static Cart mCart = new Cart();
    static User mUser;    // mUser 라는 이름의 User 타입 정적 변수를 선언

    public static void main(String[] args) {

        // String[][] mBook = new String[NUM_BOOK][NUM_ITEM];	// 2차원 문자열 mBook 변수에 새로운 2차원 문자열 배열을 생성하여 할당
        Book[] mBookList = new Book[NUM_BOOK];

        Scanner input = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = input.next();

        System.out.print("연락처를 입력하세요 : ");
        int userMobile = input.nextInt();


        mUser = new User(userName, userMobile);    // User 클래스의 객체를 생성하여 입력받은 고객의 정보 저장

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
                        // menuCartAddItem(mBook);
                        menuCartAddItem(mBookList);
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
                        menuAdminLogin();    // 관리자.
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

    public static void menuGuestInfo(String name, int mobile) {    // menuGuestInfo 는 문자열 변수 name 과 정수형 변수 mobile 을 파라미터로 받고 있음.
        System.out.println("현재 고객 정보 : ");
        System.out.println("이름 " + mUser.getName() + "   연락처 " + mUser.getPhone());    // 정적 변수 mUser 는 CartItem 클래스의 Name 과 Phone 을 받아옴.
    }

    public static void menuCartItemList() {
/*        System.out.println("장바구니 상품 목록 :");
        System.out.println("---------------------------------------");
        System.out.println("    도서ID \t|     수량 \t|      합계");
        for (int i = 0; i < mCartCount; i++) {
            System.out.print("    " + mCartItem[i].getBookID() + " \t| ");    // 책의 이름 출력
            System.out.print("    " + mCartItem[i].getQuantity() + " \t| ");    // 책의 수량 출력
            System.out.print("    " + mCartItem[i].getTotalPrice());    // 총 가격 출력
            System.out.println("  ");
        }
        System.out.println("---------------------------------------");*/

        if (mCart.mCartCount >= 0) {
            mCart.printCart();
        }
        }
    }

    public static void menuCartClear() {
        // System.out.println("장바구니 비우기");
        if (mCart.mCartCount == 0) {
            System.out.println("장바구니에 항목이 없습니다.");
        } else {
            System.out.println("장바구니의 모든 항목을 삭제하겠습니까? Y | N");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();

            if (str.toUpperCase().equals("Y")) {
                System.out.println("장바구니의 모든 항목을 삭제했습니다.");
                mCart.deleteBook();
            }
        }
    }

    // 장바구니에 도서 추가하기
    public static void menuCartAddItem(Book[] bookList) { // menuCartAddItem 메서드는 book 변수에 String 2차원 배열을 매개변수로 받음.

        BookList(bookList);    // BookList 라는 메서드를 호출하면서 book 이라는 변수를 매개변수로 전달 -> 메서드의 기능을 실행하라고 요청

/*        for (int i = 0; i < NUM_BOOK; i++) {    // 책의 수 : 행(row). 1차원.
            for (int j = 0; j < NUM_ITEM; j++)    // 책 정보 : 열(col). 2차원
                System.out.print(book[i][j] + " | ");    // 책 정보 표시
            System.out.println(" ");
        }*/
        mCart.printBookList(bookList);

        boolean quit = false;    // 논리형 quit 변수 설정. false 로 초기화.

        while (!quit) {

            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 :");

            Scanner input = new Scanner(System.in);
            String str = input.nextLine();    // 도서의 ID를 입력.

            boolean flag = false;    // 논리형 flag 변수 설정. false 로 초기화.
            int numId = -1;    // 정수형 변수 numId = -1로 초기화.

            for (int i = 0; i < NUM_BOOK; i++) {    // NUM_BOOK 까지 i 값이 커지면서 반복을 함.
                if (str.equals(bookList[i].getBookId())) {    // 변수 str 에 저장된 문자열이 book 배열의 특정 위치에 있는 문자열과 같은지 비교.
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
                    System.out.println(bookList[numId].getBookId() + " 도서가 장바구니에 추가되었습니다.");    // numId에 저장된 행 인덱스와 [0] 열에 있는 책 ID를 출력
                    // 장바구니에 넣기
                    if (!isCartInBook(bookList[numId].getBookId()))    // 장바구니에 해당 책이 아직 없다면
                        //mCartItem[mCartCount++] = new CartItem(book[numId]);
                        // 장바구니 배열 mCartItem 에 새로운 CartItem 객체를 생성하는 역할.
                        // mCartCount++를 통해 아이템을 넣은 후 자동으로 다음 칸으로 옮김.
                        mCart.insertBook(bookList[numId]);
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
        // System.out.println("6. 장바구니의 항목 삭제하기");
        if (mCart.mCartCount == 0) {
            System.out.println("장비구니에 항목이 없습니다.");
        } else {
            menuCartItemList();
            boolean quit = false;
            while (!quit) {
                System.out.print("장바구니에서 삭제할 도서의 ID를 입력하세요 : ");
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                boolean flag = false;
                int numId = -1;

                for (int i = 0; i < mCart.mCartCount; i++) {
                    if (str.equals(mCart.mCartItem[i].getBookID())) {
                        numId = i;
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    System.out.println("장바구니의 항목을 삭제하겠습니까? Y | N");
                    str = sc.nextLine();
                    if (str.toUpperCase().equals("Y")) {
                        System.out.println(mCart.mCartItem[numId].getBookID() + "장바구니에서 도서가 삭제되었습니다.");
                        mCart.removeCart(numId);
                    }
                    quit = true;
                } else System.out.println("다시 입력해 주세요.");
            }
        }
    }

    public static void menuCartBill() {
        System.out.println("7. 영수증 표시하기");
    }

    public static void menuExit() {
        System.out.println("8. 종료");
    }

    public static void BookList(Book[] bookList) {

        bookList[0] = new Book("ISBN1234", "쉽게 배우는 JSP 웹 프로그래밍", 27000);
        bookList[0].setAuthor("송미영");
        bookList[0].setDescription("단계별로 쇼핑몰을 구현하여 배우는 JSP 웹 프로그래밍");
        bookList[0].setCategory("IT전문서");
        bookList[0].setReleaseDate("2018/10/08");

        bookList[1] = new Book("ISBN1235", "안드로이드 프로그래밍", 33000);
        bookList[1].setAuthor("우재남");
        bookList[1].setDescription("실습 단계별 명쾌한 멘토링!");
        bookList[1].setCategory("IT전문서");
        bookList[1].setReleaseDate("2022/01/22");

        bookList[1] = new Book("ISBN1236", "스크래치", 22000);
        bookList[1].setAuthor("고광일");
        bookList[1].setDescription("컴퓨팅 사고력을 키우는 블록 코딩");
        bookList[1].setCategory("컴퓨터입문");
        bookList[1].setReleaseDate("2019/06/10");
    }

    public static boolean isCartInBook(String bookId) { // isCartInBook 메서드는 bookId 문자열 변수를 매개변수로 받고 있음.

/*        boolean flag = false;
        for (int i = 0; i < mCartCount; i++) {    // 장바구니에 있는 상품의 개수(mCartCount)만큼 반복
            if (bookId == mCartItem[i].getBookID()) {    // 장바구니에 담긴 각 상품(mCartItem[i])의 ID를 가져와서, 매개변수로 받은 bookId와 같은지 비교

                mCartItem[i].setQuantity(mCartItem[i].getQuantity() + 1);
                // 일치하는 책을 찾으면, 그 책의 현재 수량(getQuantity())에 1을 더해서 다시 설정(setQuantity())

                flag = true; // 책을 찾았으니 true
            }
        }
        return flag; // 반환
    }*/
        return mCart.isCartInBook(bookId);

    public static void menuAdminLogin() {    // 관리자 로그인 정보.
        System.out.println("관리자 정보를 입력하세요");

        Scanner input = new Scanner(System.in);
        System.out.print("아이디 : ");
        String adminId = input.next();

        System.out.print("비밀번호 : ");
        String adminPW = input.next();

        // Admin 클래스의 새로운 인스턴스(객체)를 만들고, 그 객체를 admin 이라는 변수에 할당
        // mUser.getName()과 mUser.getPhone()을 생성자의 인자로 사용
        // mUser 라는 객체에서 가져오고 있음
        Admin admin = new Admin(mUser.getName(), mUser.getPhone());

        if (adminId.equals(admin.getId()) && adminPW.equals(admin.getPassword())) {    // 입력한 adminId 가 새로 생성한 변수 admin 에게 받아온 getId 가 일치한지 그리고 비밀번호도 일치한지 비교
            System.out.println("이름 " + admin.getName() + "   연락처 " + admin.getPhone());    // 일치한다면 받아온 admin 이름과 폰번호 출력
            System.out.println("아이디 " + admin.getId() + "   비밀번호 " + admin.getPassword());    // 받아온 Id 와 Password 출력
        } else
            System.out.println("관리자 정보가 일치하지 않습니다.");    // 일치하지 않다면 출력
    }
}