package BookMarket;

public abstract class Item {    // 추상 클래스 Item 여러 '실체 클래스'들의 공통적인 특성(필드나 메서드)을 추출해서 선언한 부분적으로만 구현
    String bookId;  // 문자열 bookId 필드 선언 - 책 번호
    String name;    // 문자열 name 필드 선언 - 이름
    int unitPrice;  // 정수형 unitPrice 선언 - 갯수

    public Item(String bookId, String name, int unitPrice) {    // 생성자
        this.bookId = bookId;
        this.name = name;
        this.unitPrice = unitPrice;
    }

    abstract String getBookId();

    abstract String getName();

    abstract int getUnitPrice();

    abstract void setBookId(String bookId);

    abstract void setName(String name);

    abstract void setUnitPrice(int unitPrice);

}
