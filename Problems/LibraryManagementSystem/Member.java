package Problems.LibraryManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Member implements MemberObserver {
    private int memberId;
    private String memberName;
    private List<BorrowRecord> borrowedCopies;
    private String emailId;
    private String phoneNumber;

    public Member(int memberId, String memberName, String emailId, String phoneNumber) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
        this.borrowedCopies = new ArrayList<>();
    }
    
    public int getMemberId() {
        return memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public String getEmailId() {
        return emailId;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void updateBorrowedCopies(BorrowRecord record) {
        borrowedCopies.add(record);
    }
    public void removeBorrowedCopy(BorrowRecord record) {
        borrowedCopies.remove(record);
    }
    public List<BorrowRecord> getBorrowedCopies() {
        return borrowedCopies;
    }
    public void update(String message){
        System.out.println("Notification for member " + memberName + ": " + message);
    }
}

