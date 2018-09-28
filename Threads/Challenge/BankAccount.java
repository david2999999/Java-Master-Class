package Threads.Challenge;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private String accountNumber;
    private double balance;

    private Lock lock;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.lock = new ReentrantLock();
    }

//    public synchronized void deposit(double amount) {
//        balance += amount;
//    }
//
//    public synchronized void withdraw(double amount) {
//        balance -= amount;
//    }


//    public void deposit(double amount) {
//        synchronized (this) {
//            balance += amount;
//        }
//
//    }
//
//    public void withdraw(double amount) {
//        synchronized (this) {
//            balance -= amount;
//        }
//    }

    public void deposit(double amount) {
        lock.lock();
        try {
            this.balance += amount;
        } finally {
            lock.unlock();
        }
    }

    public void withdraw(double amount) {
        lock.lock();

        try {
            this.balance -= amount;
        } finally {
            lock.unlock();
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void printAccountNumber() {
        System.out.println("Account Number = " + accountNumber);
    }
}
