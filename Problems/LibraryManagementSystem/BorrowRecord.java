package Problems.LibraryManagementSystem;
import java.time.LocalDateTime;

public class BorrowRecord {
    private int recordId;
    private Member member;
    private BookCopy bookCopy;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;
    private LocalDateTime dueDate;

    public BorrowRecord(int recordId, Member member, BookCopy bookCopy, LocalDateTime borrowDate, LocalDateTime dueDate) {
        this.recordId = recordId;
        this.member = member;
        this.bookCopy = bookCopy;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
    }

    public boolean isOverdue() {
        return LocalDateTime.now().isAfter(dueDate);
    }

    public double calculateFine() {
        if(isOverdue()){
            long daysOverdue = java.time.Duration.between(dueDate, returnDate).toDays();
            return daysOverdue * 1.0; // Assuming a fine of $1 per day overdue
        }
        return 0.0;
    }

    public void markAsReturned() {
        this.returnDate = LocalDateTime.now();
        bookCopy.returnCopy();
    }
    public int getRecordId() {
        return recordId;
    }
    public Member getMember() {
        return member;
    }
    public BookCopy getBookCopy() {
        return bookCopy;
    }
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }
}
