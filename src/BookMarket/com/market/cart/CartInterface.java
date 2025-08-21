package BookMarket.com.market.cart;

import BookMarket.com.market.bookitem.Book;

public interface CartInterface {
    void printBookList(Book[] p);
    boolean isCartInBook(String id);
    void insertBook(Book p);
    void removeCart(int numId);
    void deleteBook();
}
