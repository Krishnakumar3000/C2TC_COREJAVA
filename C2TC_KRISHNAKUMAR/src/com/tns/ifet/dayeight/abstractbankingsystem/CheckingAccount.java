package com.tns.ifet.dayeight.abstractbankingsystem;
class CheckingAccount extends Account {
 private static final double OVERDRAFT_LIMIT = 500; // final constant for overdraft limit

 public CheckingAccount(String accountHolder, double initialBalance) {
     super(accountHolder, initialBalance);
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         double newBalance = getBalance() + amount;
         System.out.println("Deposited into Checking Account: " + amount);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 @Override
 public void withdraw(double amount) {
     if (amount <= getBalance() + OVERDRAFT_LIMIT) {
         double newBalance = getBalance() - amount;
         System.out.println("Withdrawn from Checking Account: " + amount);
     } else {
         System.out.println("Insufficient funds and overdraft limit exceeded.");
     }
 }

 @Override
 public double retrieveBalance() {
     return getBalance(); // Retrieves the current balance
 }
}