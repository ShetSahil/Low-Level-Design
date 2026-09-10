package Problems.ATM;
import java.util.*;

public class ATM {
    private ATMCashManager cashManager;
    private ATMState state;
    // HashMap<Integer,Card> activeCards;

    public ATM(ATMCashManager cashManager){
        this.state= new IdleState();
        this.cashManager=cashManager;
    }

    public void setState( ATMState state){
        this.state=state;
    }

    public void insertCard(Card card){
        state.insertCard(this, card);
    }

    public void authenticate(Card card){
        state.authenticate(this, card);
    }

    public void processing(Card card , long amount , int pin , String withDrawlOrDeposit){
        state.processing(this, card, amount, pin, withDrawlOrDeposit, cashManager);
        System.out.println("The current cash in the ATM is "+cashManager.getATMCash());
        System.out.println("The current cash in the Card is "+ card.getAccount().getBalance());
    }


    

}
