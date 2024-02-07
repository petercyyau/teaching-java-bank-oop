/**
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240207
 *
 * Description: The Bank class represents a bank
 * that manages a list of accounts and performs bank-wide transactions.
 */

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Bank {

    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    /**
     * Adds an account to the bank.
     *
     * @param account The account to add.
     */
    public void addAccount(Account account) {
        accounts.add(account);
    }

    /**
     * Processes bank-wide transactions.
     * Implement financial transaction logic here.
     */
    public void processTransactions() {
        // Implement financial transaction logic here
        // For example, update balances, handle transfers, etc.
        System.out.println("Processing transactions in " + name + " bank.");
    }

    /**
     * Gets the name of the bank.
     *
     * @return The name of the bank.
     */
    public String getName() {
        return name;
    }
}
