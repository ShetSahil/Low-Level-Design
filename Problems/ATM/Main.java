package Problems.ATM;

import java.time.YearMonth;

public class Main {

    public static void main(String[] args) {

        // ATM has ₹50,000 cash
        ATMCashManager cashManager = new ATMCashManager(50000);

        // Create Account
        Account account = new SavingAccount(
                101,
                "Sahil",
                100000
        );

        // Create Card
        Card card = new Card(
                123456,
                YearMonth.of(2027, 12),
                123,
                1234,
                account
        );

        // Create ATM
        ATM atm = new ATM(cashManager);

        // -------------------------
        // Insert Card
        // -------------------------
        atm.insertCard(card);

        // -------------------------
        // Authenticate Card
        // Checks expiry
        // -------------------------
        atm.authenticate(card);

        // -------------------------
        // Withdraw ₹5000
        // PIN = 1234
        // -------------------------
        atm.processing(
                card,
                5000,
                1234,
                "Withdrawal"
        );

        System.out.println();

        // -------------------------
        // Insert card again
        // -------------------------
        atm.insertCard(card);

        atm.authenticate(card);

        // -------------------------
        // Deposit ₹2000
        // -------------------------
        atm.processing(
                card,
                2000,
                1234,
                "Deposit"
        );
    }
}