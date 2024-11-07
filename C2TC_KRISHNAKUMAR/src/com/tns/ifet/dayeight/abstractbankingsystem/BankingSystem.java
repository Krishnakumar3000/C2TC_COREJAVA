package com.tns.ifet.dayeight.abstractbankingsystem;
		public class BankingSystem {
		    public static void main(String[] args) {
		        // Create bank accounts
		        Account savingsAccount = new SavingsAccount("Alice", 1000);
		        Account checkingAccount = new CheckingAccount("Bob", 500);

		        // Display account information
		        savingsAccount.displayAccountInfo();
		        checkingAccount.displayAccountInfo();

		        // Perform transactions
		        savingsAccount.deposit(200); // Alice deposits 200 into savings
		        checkingAccount.withdraw(600); // Bob withdraws 600 from checking

		        // Apply interest to the savings account
		        ((SavingsAccount) savingsAccount).applyInterest(); // Apply interest to savings

		        // Display updated account info
		        savingsAccount.displayAccountInfo();
		        checkingAccount.displayAccountInfo();

		        // Check balances
		        System.out.println("Savings Account Balance: " + savingsAccount.retrieveBalance());
		        System.out.println("Checking Account Balance: " + checkingAccount.retrieveBalance());
		    }
		}