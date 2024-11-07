package com.tns.ifet.dayeight.abstractbankingsystem;
//Abstract class representing a Bank Account
abstract class Account {
 private String accountHolder;
 private double balance;

 // Constructor to initialize account details
 public Account(String accountHolder, double initialBalance) {
     this.accountHolder = accountHolder;
     this.balance = initialBalance;
 }

 // Getter for account holder's name
 public String getAccountHolder() {
     return accountHolder;
 }

 // Getter for account balance
 public double getBalance() {
     return balance;
 }

 // Abstract method for depositing money, to be implemented by subclasses
 public abstract void deposit(double amount);

 // Abstract method for withdrawing money, to be implemented by subclasses
 public abstract void withdraw(double amount);

 // Concrete method for displaying account information
 public void displayAccountInfo() {
     System.out.println(accountHolder + "'s Account | Balance: " + balance);
 }

 // Abstract method to get the balance
 public abstract double retrieveBalance();
}
