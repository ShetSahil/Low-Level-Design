package Problems.ATM;

public class SavingAccount implements Account {
    private int accountID;
    private AccountType accountType;
    private String accountHolderName;
    private long balance;

    public SavingAccount(int accountID , String accountHolderName , long balance){
        this.accountID=accountID;
        this.accountType = AccountType.SAVING;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public int getAccountID(){
        return accountID;
    }
    public AccountType getAccountType(){
        return accountType;
    }
    public String getAccountHolderName(){
        return accountHolderName;
    }
    public long getBalance(){
        return balance;
    }
    public boolean isWithdrawlPossible(long amount){
        return balance>=amount;
    }
    public void withdrawl(long amount){
        balance-=amount;
    }
    public void deposit(long amount){
        balance+=amount;
    }

    
}
