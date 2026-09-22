package Problems.LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private int libraryId;
    private String libraryName;
    private List<Book> books;
    private List<Member> members;

    public Library(int libraryId, String libraryName) {
        this.libraryId = libraryId;
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
    }

    public int getLibraryId() {
        return libraryId;
    }
    public String getLibraryName() {
        return libraryName;
    }
    public void addBook(Book book) {
        books.add(book);
    }
    public void removeBook(Book book) {
        books.remove(book);
    }
    public void addMember(Member member) {
        members.add(member);
    }
    public void removeMember(Member member) {
        members.remove(member);
    }
    public void notifyAllMembers(Book book){
        for(Member member : members){
            member.update("New book available: " + book.getBookTitle());
        }
    }
    public BorrowRecord rentBook(Member member, Book book){
        BookCopy availableCopy = book.getAvailableCopies();
        if(availableCopy != null){
            availableCopy.borrowCopy();
            int borrowId = (int) (Math.random() * 10000);
            BorrowRecord record = new BorrowRecord(borrowId, member, availableCopy, java.time.LocalDateTime.now(), java.time.LocalDateTime.now().plusDays(14));
            member.updateBorrowedCopies(record);
            return record;
        } else {
            throw new IllegalStateException("No available copies for the book: " + book.getBookTitle());
        }
    }
    public void returnBook(Member member, BorrowRecord record , PaymentStrategy paymentMethod){
        record.markAsReturned();
        member.removeBorrowedCopy(record);
        calculateFineAndProcessPayment(member, record, paymentMethod);
    }
    public void calculateFineAndProcessPayment(Member member, BorrowRecord record, PaymentStrategy paymentMethod){
        double fine = record.calculateFine();
        if(fine > 0){
            System.out.println("Member " + member.getMemberName() + " has a fine of $" + fine);
            // Here you can implement a payment strategy, for example:
            paymentMethod.pay(fine);
        }
        else{
            System.out.println("No fine for member " + member.getMemberName());
        }
    }

}
