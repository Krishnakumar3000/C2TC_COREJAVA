package com.tns.ifet.dayeight.staticbankingsytem;
	class SavingsAccount extends Account {
	    private static final double INTEREST_RATE = 0.02;

	    public SavingsAccount(String accountHolder, double initialBalance) {
	        super(accountHolder, initialBalance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= getBalance()) {
	            double newBalance = getBalance() - amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient funds for withdrawal.");
	        }
	    }

	    @Override
	    public void displayAccountInfo() {
	        System.out.println("Savings Account of " + getAccountHolder() + " | Balance: " + getBalance());
	    }
	    public void applyInterest() {
	        double interest = getBalance() * INTEREST_RATE;
	        deposit(interest);
	        System.out.println("Interest of " + interest + " applied.");
	    }
	}