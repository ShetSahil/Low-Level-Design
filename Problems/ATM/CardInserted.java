package Problems.ATM;

public class CardInserted implements ATMState{
    public void insertCard(ATM atm ,Card card){
        System.out.println("Card is  already inserted , please authenticate the card");
    }
    public boolean authenticate(ATM atm ,Card card){
        System.out.println("Authenticating the Card with the background information");
        if(card.isValid()){
            atm.setState(new Processing());
            return true;
        }
        return false;
        
    }
    public void processing(ATM atm ,Card card , long amount , int pin , String withDrawlOrDeposit , ATMCashManager cashManager){
        System.out.println("Cannot process before authenticating the Card");
    }
}
