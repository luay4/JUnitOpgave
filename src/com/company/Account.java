package com.company;

public class Account {

    private String accountNumber;
    private String accountOwnerName;
    private int balance;

    public Account(String accountNumber, String accountOwnerName, int balance) {
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
        this.balance = balance;
    }

    public Account(String accountNumber, String accountOwnerName) {
        this.accountNumber = accountNumber;
        this.accountOwnerName = accountOwnerName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void setAccountOwnerName(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int insert(int amount) {
        int newBalance = balance + amount;
        balance = newBalance;
        return balance;
    }

    public int withdraw(int amount) {
        int newBalance = balance - amount;
        if (newBalance < 0) {
            return -1;
        } else {
            balance = newBalance;
            return newBalance;
        }
    }

    public int transfer(Account recipientAccount, int amount) {
        int newBalance = balance - amount - 5;
        if (newBalance < 0) {
            return -1;
        } else {
            balance = newBalance;
            recipientAccount.insert(amount);
            return balance;
        }
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber + "\nAccount owner: " + accountOwnerName
                + "\nBalance: " + balance;
    }
}
