package com.tns.ifet.dayeight.finalbankingsystem;
	public class BankingSystem {
	    public static void main(String[] args) {
	        // Create instances of SavingsAccount and CheckingAccount
	        Account savingsAccount = new SavingsAccount("Alice", 1000);
	        Account checkingAccount = new CheckingAccount("Bob", 500);

	        // Display initial account information
	        savingsAccount.displayAccountInfo();
	        checkingAccount.displayAccountInfo();

	        // Create an instance of the Transaction class
	        Transaction transaction = new Transaction();

	        // Perform a deposit transaction for Alice's savings account
	        transaction.performTransaction(savingsAccount, 200);  // Alice deposits 200 (plus transaction fee)

	        // Perform a withdrawal transaction for Bob's checking account
	        transaction.performTransaction(checkingAccount, -300); // Bob withdraws 300 (plus transaction fee)

	        // Perform a transaction with insufficient funds
	        transaction.performTransaction(checkingAccount, -1200); // Insufficient funds for withdrawal + transaction fee

	        // Display updated account balances
	        savingsAccount.displayAccountInfo();
	        checkingAccount.displayAccountInfo();
	    }
	}