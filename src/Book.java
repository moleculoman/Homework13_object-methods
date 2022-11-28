import java.util.Objects;

public class Book {
    //attributes
    private int bookYear;
    private String bookName;
    protected Author author;

    //constructor
    public Book(int bookYear, String bookName, Author author) {
        this.bookYear = bookYear;
        this.bookName = bookName;
        this.author = author;

    }
    public String getBookName() {
        return this.bookName;
    }
    public int getBookYear() {
        return this.bookYear;
    }
    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookYear, bookName, author);
    }

    @Override
    public String toString() {
        return bookName+", "+bookYear+ ", " +author;
    }
}
