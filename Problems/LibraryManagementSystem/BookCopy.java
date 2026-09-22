package Problems.LibraryManagementSystem;

public class BookCopy {
    private int copyId;
    private BookStatus bookCopyStatus;

    public BookCopy(int copyId) {
        this.copyId = copyId;
        this.bookCopyStatus = BookStatus.AVAILABLE;
    }

    public int getCopyId() {
        return copyId;
    }

    public boolean isAvailable() {
        return bookCopyStatus == BookStatus.AVAILABLE;
    }

    public void borrowCopy() {
        if (isAvailable()) {
            bookCopyStatus = BookStatus.BORROWED;
        } else {
            throw new IllegalStateException("Book copy is not available for borrowing.");
        }
    }

    public void returnCopy() {
        if (bookCopyStatus == BookStatus.BORROWED) {
            bookCopyStatus = BookStatus.AVAILABLE;
        } else {
            throw new IllegalStateException("Book copy is not currently borrowed.");
        }
    }

    public void markOutOfStock() {
        bookCopyStatus = BookStatus.OUT_OF_STOCK;
    }
}
