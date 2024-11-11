package com.tns.ifet.dayeight.assignment.bankingsystem;
import java.util.Scanner;

// Abstract Account class
abstract class Account {
    protected String accountHolder;
    protected double balance;

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    // Concrete method
    public String getAccountHolder() {
        return accountHolder;
    }
}

// SavingsAccount class inheriting from Account
class SavingsAccount extends Account {
    public SavingsAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " to Savings Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// CheckingAccount class inheriting from Account
class CheckingAccount extends Account {
    public CheckingAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " to Checking Account.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " from Checking Account.");
        } else {
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}

// Bank class with static variable for total accounts
class Bank {
    private static int totalAccounts = 0;

    // Static method to get the total accounts
    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Method to create a new account
    public static Account createAccount(String accountType, String accountHolder, double initialBalance) {
        Account newAccount = null;
        if (accountType.equalsIgnoreCase("savings")) {
            newAccount = new SavingsAccount(accountHolder, initialBalance);
        } else if (accountType.equalsIgnoreCase("checking")) {
            newAccount = new CheckingAccount(accountHolder, initialBalance);
        }

        if (newAccount != null) {
            totalAccounts++;
        }
        return newAccount;
    }
}

// Transaction class with final methods
class Transaction {
    private final double transactionFee = 2.5;  // Fixed transaction fee

    // Final method to perform transaction
    public final void performTransaction(Account account, double amount, String type) {
        if (type.equalsIgnoreCase("deposit")) {
            account.deposit(amount);
        } else if (type.equalsIgnoreCase("withdraw")) {
            account.withdraw(amount);
        }
        System.out.println("Transaction completed with fee: " + transactionFee);
    }

    // Method to get transaction fee
    public double getTransactionFee() {
        return transactionFee;
    }
}

// Main class to run the system
public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        Transaction transaction = new Transaction();

        // Ask for user's name
        System.out.print("Enter your name: ");
        String accountHolder = scanner.nextLine();

        System.out.println("Hello, " + accountHolder + "!");
        System.out.print("Enter account type (savings/checking): ");
        String accountType = scanner.nextLine();

        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();  // Consume the newline character

        // Create account
        Account account = Bank.createAccount(accountType, accountHolder, initialDeposit);
        if (account == null) {
            System.out.println("Invalid account type.");
            return; // Exit if account creation fails
        }

        System.out.println("Account created successfully! Total accounts: " + Bank.getTotalAccounts());
        System.out.println(accountHolder + "'s " + accountType + " account balance: " + account.getBalance());

        // Perform transactions
        while (true) {
            System.out.println("\nChoose a transaction:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                transaction.performTransaction(account, depositAmount, "deposit");
            } else if (choice == 2) {
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                transaction.performTransaction(account, withdrawAmount, "withdraw");
            } else if (choice == 3) {
                System.out.println(accountHolder + "'s account balance: " + account.getBalance());
            } else if (choice == 4) {
                System.out.println("Exiting the system.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
