package srp.good;

public class Book {

    String name, authorName, isbn;
    int year, price;

    public Book(String name, String authorName, String isbn, int year, int price) {
        this.name = name;
        this.authorName = authorName;
        this.isbn = isbn;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
