package com.tns.ifet.dayeight.staticbankingsytem;
	class CheckingAccount extends Account {
	    private static final double OVERDRAFT_LIMIT = 500; 

	    public CheckingAccount(String accountHolder, double initialBalance) {
	        super(accountHolder, initialBalance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= getBalance() + OVERDRAFT_LIMIT) {
	            double newBalance = getBalance() - amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient funds and overdraft limit exceeded.");
	        }
	    }

	    @Override
	    public void displayAccountInfo() {
	        System.out.println("Checking Account of " + getAccountHolder() + " | Balance: " + getBalance());
	    }
	}