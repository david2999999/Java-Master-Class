package Threads.Challenge;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }


    public void deposit(double amount) {
        synchronized (this) {
            balance += amount;
        }

    }

    public void withdraw(double amount) {
        synchronized (this) {
            balance -= amount;
        }
    }
}
