package com.tns.ifet.dayeight.abstractbankingsystem;
//Savings Account class extending Account
class SavingsAccount extends Account {
 private static final double INTEREST_RATE = 0.02; // final constant for interest rate

 public SavingsAccount(String accountHolder, double initialBalance) {
     super(accountHolder, initialBalance);
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         double newBalance = getBalance() + amount;
         System.out.println("Deposited into Savings Account: " + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= getBalance()) {
         double newBalance = getBalance() - amount;
         System.out.println("Withdrawn from Savings Account: " + amount);
     } else {
         System.out.println("Insufficient funds for withdrawal.");
     }
 }

 @Override
 public double retrieveBalance() {
     return getBalance(); // Retrieves the current balance
 }

 // Method to apply interest to the balance
 public void applyInterest() {
     double interest = getBalance() * INTEREST_RATE;
     deposit(interest);
     System.out.println("Interest applied to Savings Account: " + interest);
 }
}