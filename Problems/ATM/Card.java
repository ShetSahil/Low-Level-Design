package Problems.ATM;

import java.time.YearMonth;

public class Card {
    private int CardNo;
    private YearMonth expiryDate;
    private int cvv;
    private int pin;
    Account account;

    public Card(int cardNo , YearMonth expiryDate , int cvv , int pin , Account account){
        this.CardNo=cardNo;
        this.expiryDate=expiryDate;
        this.cvv=cvv;
        this.pin=pin;   
        this.account=account;
    }

    public int getCardNo(){
        return CardNo;
    }
    public YearMonth getExpiryDate(){
        return expiryDate;
    }
    public int getCvv(){
        return cvv;
    }
    public int getPin(){
        return pin;
    }
    public Account getAccount(){
        return account;
    }
    public boolean isValid(int pin){
        return this.pin==pin;
    }

    public boolean isValid(){
        return YearMonth.now().isBefore(expiryDate) || YearMonth.now().equals(expiryDate);
    }

    public boolean checkPin(int pin){
        return this.pin==pin;
    }

    public void setPin(int newPin){
        pin=newPin;
    }

    public void withDrawl(long amount){
        if(account.isWithdrawlPossible(amount)){
            account.withdrawl(amount);
        }else{
            return;
        }
    }
    public void deposit(long amount){
        account.deposit(amount);
    }

}
