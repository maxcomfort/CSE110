// CSE 110     : 14869 / Online
// Assignment  : 03
// Author      : Max Comfort & 1219098192
// Description : A program to determine whether to buy, sell, or hold
//share in a stock market

 import java.util.Scanner;

public class Assignment03 {

    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);
        
        // declare and initialize variables
        int currentShares; //variable current number of share
        double purchasePrice; //variable for per share price of stock when purchased
        double marketPrice; //variable for per share market price of stock
        double availableFunds; //variable for amount of funds user has on hand
        double transactionFee = 10; //constant variable for transaction fee

        
        // prompt for and collect inputs
        System.out.print("Current Shares  : ");
        currentShares = in.nextInt(); //user enters current # of shares

        System.out.print("Purchase Price  : ");
        purchasePrice = in.nextDouble(); //user enters per share price of stock when purchased

        System.out.print("Market Price    : ");
        marketPrice = in.nextDouble(); //user enters per share market price of stock

        System.out.print("Available Funds : ");
        availableFunds = in.nextDouble(); //user enters amount of funds on hand
        
        // compute required values

        double perShareBuyValue = purchasePrice - marketPrice; //equation for per share buy value

        double numberOfSharesToBuy = Math.floor((availableFunds - transactionFee) / marketPrice); //equation for number of shares to buy

        double totalBuyCost = transactionFee + (marketPrice * numberOfSharesToBuy); //equation for total cost of buying stocks
        
        double totalBuyValue = perShareBuyValue * numberOfSharesToBuy; //equation for total buy value

        double perShareSellValue = marketPrice - purchasePrice; //equation for per share sell value
        
        double totalSellValue = perShareSellValue * currentShares; //equation for total sell value

        double numberOfSharesToSell = totalSellValue / perShareSellValue; //equation for total number of shares to sell

        double totalSellCost = transactionFee + (marketPrice * numberOfSharesToSell); //equation for total sell cost
       
        // display required outputs
        if ((perShareBuyValue > perShareSellValue) && (totalBuyValue > transactionFee)) {
            System.out.println("\nBuy " + (int)numberOfSharesToBuy + " shares");
            } else if ((perShareSellValue > perShareBuyValue) && (totalSellValue > transactionFee)) {
                System.out.println("\nSell " + (int)numberOfSharesToSell + " shares");
            }else {
            System.out.println("\nHold shares");
        }
    }
}
