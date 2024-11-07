package com.tns.ifet.dayeight.staticbankingsytem;
	class Bank {
	    private String bankName;
	    private static int totalAccounts = 0; 
	    public Bank(String bankName) {
	        this.bankName = bankName;
	    }
	    public static int getTotalAccounts() {
	        return totalAccounts;
	    }
	    public static SavingsAccount createSavingsAccount(String accountHolder, double initialBalance) {
	        totalAccounts++; 
	        return new SavingsAccount(accountHolder, initialBalance);
	    }
	    public static CheckingAccount createCheckingAccount(String accountHolder, double initialBalance) {
	        totalAccounts++; 
	        return new CheckingAccount(accountHolder, initialBalance);
	    }
	    public String getBankName() {
	        return bankName;
	    }
	}