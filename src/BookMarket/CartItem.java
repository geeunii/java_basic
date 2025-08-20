package BookMarket;

import lombok.Getter;
import lombok.Setter;

@Getter
public class CartItem {

    // getItemBook 의 멤버 변수 값을 가져오는 역할
    // 매개변수로 받은 새로운 String[] 배열 값을 this.itemBook 멤버 변수에 할당(설정하는) 역할
    @Setter
    //private String[] itemBook = new String[7];    // itemBook 이라는 문자열 변수에 String 타입 요소를 7개 담을 수 있는 배열 생성
    private Book itemBook;  // Book 클래스 적용
    private String bookID;    // bookID 라는 문자열 필드
    private int quantity;    // quantity 라는 정수 필드
    private int totalPrice;    // totalPrice 라는 정수 필드

    public CartItem(Book bookList) {
        this.itemBook = bookList;
        this.bookID = bookList.getBookId();
        this.quantity = 1;
        updateTotalPrice();
    }

/*
    // CartItem 생성자는 외부로부터 book 이라는 배열을 받아서 bookID, itemBook, quantity 를 초기화하고 최종 가격까지 계산하는 일련의 과정을 한 번에 처리
    public CartItem(String[] book) {    // CartItem 객체를 만들 때, book 이라는 이름의 String 타입 배열을 매개변수로 받겠다는 의미

        // 매개변수로 받은 book 배열의 값을 현재 CartItem 객체의 itemBook 멤버 변수에 할당
        this.itemBook = book;

        // book 배열의 첫 번째 요소(book[0])를 현재 CartItem 객체의 bookID 멤버 변수에 할당 -> 배열의 첫 번째 요소가 보통 책의 고유 식별자(ID)를 의미
        this.bookID = book[0];

        this.quantity = 1;    // 현재 CartItem 객체의 quantity(수량)를 1로 초기화

        updateTotalPrice();    // updateTotalPrice()라는 메서드를 호출합니다. 이 메서드는 총 가격을 계산하여 업데이트하는 역할
    }
*/

    public void setBookID(String bookID) {  // 매개변수로 받은 bookId 값을 this.bookID 멤버 변수에 할당하는 역할.
        // bookID가 변경되었으므로, updateTotalPrice() 메서드를 호출하여 변경된 책 ID에 따라 총 가격을 다시 계산하도록 하는 기능을 수행
        this.bookID = bookID;
        this.updateTotalPrice();
    }

    public void setQuantity(int quantity) { // 매개변수로 받은 quantity 값을 this.quantity 멤버 변수에 할당.
        // quantity 가 변경되었으므로, updateTotalPrice() 메서드를 호출하여 변경된 수량에 따라 총 가격을 다시 계산하도록 하는 기능을 수행
        this.quantity = quantity;
        this.updateTotalPrice();
    }

    public void updateTotalPrice() {    // updateTotalPrice() 메서드는 상품의 총 가격을 계산하여 totalPrice 멤버 변수에 저장하는 역할
        // totalPrice = Integer.parseInt(this.itemBook[2]) * this.quantity;
        // itemBook 배열의 세 번째 요소(인덱스 2)에 접근 -> 책의 가격에 접근.
        // itemBook[2]의 값이 문자열(String) 형태이므로, 이를 정수(Integer)로 변환하는 역할
        // this.quantity 상품의 수량 곱하기
        // 계산된 최종 값을 totalPrice 라는 멤버 변수에 할당

        totalPrice = this.itemBook.getUnitPrice() * this.quantity;
    }
}