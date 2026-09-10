package Problems.ATM;

public class ATMCashManager {
    private long amount;

    public ATMCashManager(long amount){
        this.amount=amount;
    }

    public long getATMCash(){
        return amount;
    }
    public boolean isCashAvailable(long amount){
        return this.amount>=amount;
    }

    public void disperseCash(long amount){
        this.amount-=amount;
    }

    public void setCash(long amount){
        this.amount+=amount;
    }
}
