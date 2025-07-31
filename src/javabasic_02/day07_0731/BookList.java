package javabasic_02.day07_0731;

public class BookList {
    public static void main(String[] args) {

        Book book1 = new Book();
        book1.title = "원피스";
        Book book2 = new Book();
        book2.title = "나루토";
        Book book3 = new Book();
        book3.title = "블리치";

        Book[] booklist = new Book[3];
        booklist[0] = book1;
        booklist[1] = book2;
        booklist[2] = book3;

        System.out.println("========== 각 배열의 인덱스를 참조 출력=========");
        System.out.println("01 영화제목: " + booklist[0]);
        System.out.println("02 영화제목: " + booklist[1]);
        System.out.println("03 영화제목: " + booklist[2]);

        System.out.println("==========iter 참조==========");
        for (Book book : booklist) {
            int i = 1;
            System.out.println(i++ + "번째 " + book.title);
        }

        System.out.println("==========itar 참조==========");
        for (int i = 0; i < booklist.length; i++) {
            Book book = booklist[i];
            System.out.println(i + "번째 " + book.title);
        }
    }
}
