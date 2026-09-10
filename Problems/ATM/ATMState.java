package Problems.ATM;

public interface ATMState {
    void insertCard(ATM atm ,Card card);
    boolean authenticate(ATM atm, Card card);
    void processing(ATM atm ,Card card , long amount , int pin , String withDrawlOrDeposit , ATMCashManager cashManager);
}
