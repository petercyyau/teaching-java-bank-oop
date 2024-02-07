# Financial Transaction Demo

Author: Peter Yau  
E-mail: PeterCY.Yau@glasgow.ac.uk

## Description

The Financial Transaction Demo project provides a demonstration of financial transactions using Java classes, including `Account`, `StockTrade`, and `Bank`. The `FinancialDemoDynamic` class extends this functionality by incorporating an interactive menu for user input.

## Project Structure

- **Account.java**: Represents a basic financial account with deposit, withdrawal, and balance operations.
- **StockTrade.java**: Extends the Account class and represents an account specialized for stock trading.
- **Bank.java**: Represents a bank that manages a list of accounts and performs bank-wide transactions.
- **FinancialDemo.java**: Original class demonstrating financial transactions.
- **FinancialDemoDynamic.java**: Main class demonstrating financial transactions with an interactive menu.

## How to Run

To run the FinancialDemoDynamic program:

1. Compile all Java files:

    ```bash
    javac Account.java
    javac StockTrade.java
    javac Bank.java
   javac FinancialDemo.java
    javac FinancialDemoDynamic.java
    ```
   or 
   ```bash
    javac FinancialDemo[Dynamic].java
   ```

2. Run the program:

    ```bash
    java FinancialDemo[Dynamic]
    ```

3. Follow the interactive menu to perform various financial actions.

## Interactive Menu Options

- **Deposit to Savings Account**: Allows the user to deposit an amount into the Savings Account.
- **Buy Stock**: Enables the user to buy a specified quantity of stock at a given price.
- **Display Balances**: Shows the balances of the Savings Account and Stock Account.
- **Process Bank-wide Transactions**: Initiates bank-wide transactions (placeholder logic).

## Additional Notes

- The project includes JavaDoc comments for documentation purposes.
- The FinancialDemoDynamic class includes contact information for the author.

Feel free to explore and modify the code to suit your needs. Happy programming!