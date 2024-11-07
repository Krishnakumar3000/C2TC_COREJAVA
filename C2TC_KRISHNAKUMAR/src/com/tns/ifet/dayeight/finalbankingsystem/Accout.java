package com.tns.ifet.dayeight.finalbankingsystem;
	abstract class Account {
	    private String accountHolder;
	    private double balance;

	    public Account(String accountHolder, double initialBalance) {
	        this.accountHolder = accountHolder;
	        this.balance = initialBalance;
	    }

	    public String getAccountHolder() {
	        return accountHolder;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public abstract void deposit(double amount);
	    public abstract void withdraw(double amount);
	    public abstract double retrieveBalance();
	    
	    public void displayAccountInfo() {
	        System.out.println(accountHolder + "'s Account | Balance: " + balance);
	    }
	}

	// Concrete SavingsAccount class
	class SavingsAccount extends Account {
	    private static final double INTEREST_RATE = 0.02;

	    public SavingsAccount(String accountHolder, double initialBalance) {
	        super(accountHolder, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            System.out.println("Deposited into Savings Account: " + amount);
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= getBalance()) {
	            System.out.println("Withdrawn from Savings Account: " + amount);
	        }
	    }

	    @Override
	    public double retrieveBalance() {
	        return getBalance();
	    }
	}

	// Concrete CheckingAccount class
	class CheckingAccount extends Account {
	    private static final double OVERDRAFT_LIMIT = 500;

	    public CheckingAccount(String accountHolder, double initialBalance) {
	        super(accountHolder, initialBalance);
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            System.out.println("Deposited into Checking Account: " + amount);
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount <= getBalance() + OVERDRAFT_LIMIT) {
	            System.out.println("Withdrawn from Checking Account: " + amount);
	        }
	    }

	    @Override
	    public double retrieveBalance() {
	        return getBalance();
	    }
	}