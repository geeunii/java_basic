package BookMarket;

public class Cart implements CartInterface {

    static final int NUM_BOOK = 3;
    CartItem[] mCartItem = new CartItem[NUM_BOOK];
    static int mCartCount = 0;

    public Cart() {

    }

    @Override
    public void printBookList(Book[] bookList) {
        for (int i = 0; i < bookList.length; i++) {
            System.out.println(bookList[i].getBookId());
            System.out.println(bookList[i].getName());
            System.out.println(bookList[i].getUnitPrice());
            System.out.println(bookList[i].getAuthor());
            System.out.println(bookList[i].getDescription());
            System.out.println(bookList[i].getCategory());
            System.out.println(bookList[i].getReleaseDate());
            System.out.println(" ");
        }
    }

    @Override
    public boolean isCartInBook(String bookId) {
        boolean flag = false;
        for (int i = 0; i < mCartCount; i++) {
            if (bookId == mCartItem[i].getBookID()) {
                mCartItem[i].setQuantity(mCartItem[i].getQuantity());
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void insertBook(Book book) {
        mCartItem[mCartCount++] = new CartItem(book);
    }

    @Override
    public void removeCart(int numId) {
        CartItem[] cartItems = new CartItem[NUM_BOOK];
        int num = 0;

        for (int i = 0; i < mCartCount; i++) {
            if (numId != i) {
                cartItems[num++] = mCartItem[i];
            }
        }
        mCartCount = num;
        mCartItem = cartItems;
    }

    @Override
    public void deleteBook() {
        mCartItem = new CartItem[NUM_BOOK];
        mCartCount = 0;
    }

    public void printCart() {
        System.out.println("장바구니 상품 목록 : ");
        System.out.println("-".repeat(30));
        System.out.println("\t 도서ID \t|\t 수량 \t|\t 합계");

        for (int i = 0; i < mCartCount; i++) {
            System.out.println("\t " + mCartItem[i].getBookID() + " \t| ");
            System.out.println("\t " + mCartItem[i].getQuantity() + " \t| ");
            System.out.println("\t " + mCartItem[i].getTotalPrice() + " \t| ");
            System.out.println(" ");
        }
        System.out.println("-".repeat(30));
    }
}
