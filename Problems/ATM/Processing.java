package Problems.ATM;

public class Processing implements ATMState {
    public void insertCard(ATM atm ,Card card){
        System.out.println("Card is  already inserted and authenticated ,please proceed with the withdrawl or deposit");
    }
    public boolean authenticate(ATM atm ,Card card){
        System.out.println("The Card is already authenticated and under processing stage");
        return true;
        
    }
    public void processing(ATM atm ,Card card , long amount , int pin , String withDrawlOrDeposit , ATMCashManager cashManager){
        System.out.println("Processing  the Card");
        if(card.checkPin(pin)){
            if(withDrawlOrDeposit.equalsIgnoreCase("WithDrawl")){
                card.withDrawl(amount);
                cashManager.disperseCash(amount);
            }else{
                card.deposit(amount);
                cashManager.setCash(amount);
            }
        }
        atm.setState(new IdleState());
    }
}
