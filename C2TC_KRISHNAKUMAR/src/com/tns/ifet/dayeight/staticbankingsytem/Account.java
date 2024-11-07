package com.tns.ifet.dayeight.staticbankingsytem;
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
	    public abstract void withdraw(double amount);
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }
	    public abstract void displayAccountInfo();
	}