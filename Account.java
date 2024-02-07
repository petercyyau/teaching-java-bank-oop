/**
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240207
 *
 * Description: The Account class represents a basic financial account with deposit,
 * withdrawal, and balance operations.
 */
public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * Deposits the specified amount into the account.
     *
     * @param amount The amount to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into account " + accountNumber);
    }

    /**
     * Withdraws the specified amount from the account.
     *
     * @param amount The amount to withdraw.
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from account " + accountNumber);
        } else {
            System.out.println("Insufficient funds in account " + accountNumber);
        }
    }

    /**
     * Gets the current balance of the account.
     *
     * @return The current balance.
     */
    public double getBalance() {
        return balance;
    }
}
