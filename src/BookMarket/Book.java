package BookMarket;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Book extends Item {

    private String author;
    private String description;
    private String category;
    private String releaseDate;

    public Book(String bookId, String name, int unitPrice) {
        super(bookId, name, unitPrice);
    }

    public Book(String bookId, String name, int unitPrice, String author, String description,
                String category, String releaseDate) {
        super(bookId, name, unitPrice);
        this.author = author;
        this.description = description;
        this.category = category;
        this.releaseDate = releaseDate;
    }

    @Override
    String getBookId() {
        return bookId;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getUnitPrice() {
        return unitPrice;
    }

    @Override
    void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Override
    void setName(String name) {
        this.name = name;
    }

    @Override
    void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

}
