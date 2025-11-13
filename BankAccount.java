package org.day2;

public class BankAccount {
    private final int AccountNumber;
    private final String accountHolderName;
    private double balance;

    public BankAccount(int AccountNumber, String accountHolderName, double balance) {
        this.AccountNumber = AccountNumber;
        this.accountHolderName = accountHolderName;
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
    if(amount>0){
        balance=balance+amount;
        System.out.println("Credited");
    }else {
        System.out.println("Invalid deposit amount. Must be positive.");
    }
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("invalid amount");
        }else if (amount>balance){
            System.out.println("Insufficient amount");
        }else {
            balance=balance-amount;
            System.out.println("Debited");
        }
    }

    public void printAccountDetails() {
        System.out.println("Account Number: " + AccountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------------");
    }
}
