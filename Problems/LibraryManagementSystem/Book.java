package Problems.LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private int bookId;
    private String bookTitle;
    private String Author;
    private String Category;
    private List<BookCopy> bookCopies;

    public Book(int bookId, String bookTitle, String Author, String Category) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.Author = Author;
        this.Category = Category;
        this.bookCopies = new ArrayList<>();
    }

    public int getBookId() {
        return bookId;
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public String getAuthor() {
        return Author;
    }
    public String getCategory() {
        return Category;
    }
    public BookCopy getAvailableCopies() {
        for(BookCopy copy : bookCopies) {
            if(copy.isAvailable()) {
                return copy;
            }
        }
        return null;
    }
    public void addBookCopy(BookCopy copy) {
        bookCopies.add(copy);
    }
    public void removeBookCopy(BookCopy copy) {
        bookCopies.remove(copy);
    }


}
