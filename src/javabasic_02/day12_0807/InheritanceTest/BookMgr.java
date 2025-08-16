package javabasic_02.day12_0807.InheritanceTest;

public class BookMgr extends Book {
    private Book[] booklist;

    public BookMgr(Book[] booklist) {
        this.booklist = booklist;
    }

    public void printBooklist() {
        for (Book book : booklist) {
            System.out.println(book.getTitle());
        }
    }

    public void printTotalPrice() {
        int total = 0;
        for (Book book : booklist) {
            total += book.getPrice();
        }
        System.out.println(total);
    }
}
