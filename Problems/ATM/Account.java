package Problems.ATM;

public interface Account {
    long getBalance();
    int getAccountID();
    AccountType getAccountType();
    String getAccountHolderName();
    boolean isWithdrawlPossible(long amount);
    void withdrawl(long amount);
    void deposit(long amount);
    


}
