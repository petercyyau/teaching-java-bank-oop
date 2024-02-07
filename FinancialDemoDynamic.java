/**
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240207
 *
 * Description: The FinancialDemoDynamic class is a demonstration of financial transactions
 * using the Account, StockTrade, and Bank classes with interactive menu.
 */

import java.util.Scanner;

public class FinancialDemoDynamic {
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

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Interactive menu
        int choice;
        do {
            System.out.println("\nChoose an action:");
            System.out.println("1. Deposit to Savings Account");
            System.out.println("2. Buy Stock");
            System.out.println("3. Display Balances");
            System.out.println("4. Process Bank-wide Transactions");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount for Savings Account: ");
                    double depositAmount = scanner.nextDouble();
                    savingsAccount.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter quantity of stock to buy: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter price per share: ");
                    double pricePerShare = scanner.nextDouble();
                    stockAccount.buyStock(quantity, pricePerShare);
                    break;
                case 3:
                    System.out.println("Savings Account Balance: $" + savingsAccount.getBalance());
                    System.out.println("Stock Account Balance: $" + stockAccount.getBalance());
                    break;
                case 4:
                    myBank.processTransactions();
                    break;
                case 0:
                    System.out.println("Exiting MyBank. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 0);

        // Close the scanner
        scanner.close();
    }
}
