package Problems.LibraryManagementSystem;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        System.out.println("===== Library Management System Demo =====\n");

        Library library = new Library(1, "City Central Library");

        Book book = new Book(101, "Java Design Patterns", "Alice Johnson", "Programming");
        book.addBookCopy(new BookCopy(1));
        book.addBookCopy(new BookCopy(2));

        Member member1 = new Member(1001, "Riya Sharma", "riya@example.com", "9876543210");
        Member member2 = new Member(1002, "Amit Verma", "amit@example.com", "9123456780");

        library.addBook(book);
        library.addMember(member1);
        library.addMember(member2);

        System.out.println("Available book copies before borrowing: ");
        System.out.println("Book: " + book.getBookTitle() + " | Copies available: " + book.getAvailableCopies());

        // Notify all members about a newly added book
        library.notifyAllMembers(book);

        // Borrow a book
        BorrowRecord borrowRecord = library.rentBook(member1, book);
        System.out.println("\nBorrow successful for Member: " + member1.getMemberName());
        System.out.println("Borrow Record ID: " + borrowRecord.getRecordId());
        System.out.println("Borrowed Copy ID: " + borrowRecord.getBookCopy().getCopyId());
        System.out.println("Member's current borrowed books: " + member1.getBorrowedCopies().size());

        // Return the book with a payment strategy
        library.returnBook(member1, borrowRecord, new CashPayment());

        System.out.println("\nAfter return:");
        System.out.println("Member borrowed copies: " + member1.getBorrowedCopies().size());

        // Demonstrate overdue scenario
        System.out.println("\n===== Overdue demo =====");
        Book overdueBook = new Book(202, "Clean Code", "Robert Martin", "Engineering");
        overdueBook.addBookCopy(new BookCopy(10));

        library.addBook(overdueBook);
        Member overdueMember = new Member(1003, "Neha Singh", "neha@example.com", "9988776655");
        library.addMember(overdueMember);

        BorrowRecord overdueRecord = new BorrowRecord(
                5001,
                overdueMember,
                overdueBook.getAvailableCopies(),
                LocalDateTime.now().minusDays(20),
                LocalDateTime.now().minusDays(5)
        );
        overdueBook.getAvailableCopies().borrowCopy();
        overdueMember.updateBorrowedCopies(overdueRecord);

        System.out.println("Overdue status: " + overdueRecord.isOverdue());
        // System.out.println("Fine for overdue book: $" + overdueRecord.calculateFine());

        library.returnBook(overdueMember, overdueRecord, new UPIPayment());
        System.out.println("\nLibrary demo completed successfully.");
    }
}
