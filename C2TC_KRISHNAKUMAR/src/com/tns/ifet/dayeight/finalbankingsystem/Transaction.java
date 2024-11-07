package com.tns.ifet.dayeight.finalbankingsystem;
	class Transaction {
	    private static final double transactionFee = 5.0; // final variable for transaction fee

	    // final method to perform the transaction
	    public final void performTransaction(Account account, double amount) {
	        // Ensure that the transaction fee is subtracted from the total amount
	        double totalAmount = amount + transactionFee;
	        
	        if (account.getBalance() >= totalAmount) {
	            // Perform deposit or withdrawal based on the amount sign (positive = deposit, negative = withdrawal)
	            if (amount > 0) {
	                account.deposit(amount);
	                System.out.println("Deposited: " + amount);
	            } else {
	                account.withdraw(-amount);
	                System.out.println("Withdrew: " + (-amount));
	            }
	            // Deduct the transaction fee
	            System.out.println("Transaction Fee: " + transactionFee + " deducted.");
	        } else {
	            System.out.println("Insufficient funds for the transaction (including transaction fee).");
	        }
	    }

	    // Getter for transactionFee (final variable cannot be changed)
	    public double getTransactionFee() {
	        return transactionFee;
	    }
	}