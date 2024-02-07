/**
 * Author: Peter Yau
 * E-mail: PeterCY.Yau@glasgow.ac.uk
 * Date: 20240207
 *
 * Description: The StockTrade class extends Account and represents an account
 * specialized for stock trading.
 */
public class StockTrade extends Account {
    private String stockSymbol;

    public StockTrade(String accountNumber, double balance, String stockSymbol) {
        super(accountNumber, balance);
        this.stockSymbol = stockSymbol;
    }

    /**
     * Buys a specified quantity of stock at the given price.
     *
     * @param quantity The quantity of stock to buy.
     * @param price    The price per share.
     */
    public void buyStock(int quantity, double price) {
        double totalCost = quantity * price;
        if (getBalance() >= totalCost) {
            withdraw(totalCost);
            System.out.println("Bought " + quantity + " shares of " + stockSymbol + " stock.");
        } else {
            System.out.println("Insufficient funds to buy " + quantity + " shares of " + stockSymbol + " stock.");
        }
    }

    /**
     * Sells a specified quantity of stock at the given price.
     *
     * @param quantity The quantity of stock to sell.
     * @param price    The price per share.
     */
    public void sellStock(int quantity, double price) {
        double totalEarnings = quantity * price;
        deposit(totalEarnings);
        System.out.println("Sold " + quantity + " shares of " + stockSymbol + " stock.");
    }
}
