package Problems.ATM;

public class IdleState implements ATMState {
    public void insertCard(ATM atm ,Card card){
        System.out.println("Card is inserted");
        atm.setState(new CardInserted());
    }
    public boolean authenticate(ATM atm,Card card){
        System.out.println("Cannot authenticate before inserting the Card");
        return false;
    }
    public void processing(ATM atm ,Card card , long amount , int pin , String withDrawlOrDeposit , ATMCashManager cashManager){
        System.out.println("Cannot process before inserting the Card");
    }
}
