package com.tns.ifet.dayeight.staticbankingsytem;
	public class BankingSystem {
	    public static void main(String[] args) {
	        Bank myBank = new Bank("MyBank");
	        SavingsAccount savingsAccount = Bank.createSavingsAccount("Alice", 1000);
	        CheckingAccount checkingAccount = Bank.createCheckingAccount("Bob", 500);
	        savingsAccount.displayAccountInfo();
	        checkingAccount.displayAccountInfo();
	        savingsAccount.deposit(200); 
	        checkingAccount.withdraw(600); 
	        savingsAccount.applyInterest(); 
	        System.out.println("Total bank accounts: " + Bank.getTotalAccounts());
	    }
	}