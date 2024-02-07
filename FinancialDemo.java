/**
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240207
 *
 * Description: The FinancialDemo class is a demonstration of financial transactions
 * using the Account, StockTrade, and Bank classes.
 */
public class FinancialDemo {
    /**
     * The main method creates instances of accounts, performs transactions, and demonstrates bank-wide transactions.
     *
     * @param args The command-line arguments (not used in this demo).
     */
    public static void main(String[] args) {

        // Create a bank
        Bank myBank = new Bank("Peter's Bank");
        System.out.println("Welcome to " + myBank.getName() + "!");

        // Create accounts and add them to the bank
        Account savingsAccount = new Account("Savings123", 1000.0);
        StockTrade stockAccount = new StockTrade("Stock456", 5000.0, "AAPL");

        myBank.addAccount(savingsAccount);
        myBank.addAccount(stockAccount);

        // Perform transactions
        savingsAccount.deposit(500.0);
        stockAccount.buyStock(10, 150.0);

        // Display balances
        System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
        System.out.println("Stock Account Balance: $" + stockAccount.getBalance());

        // Process bank-wide transactions
        myBank.processTransactions();
    }
}
