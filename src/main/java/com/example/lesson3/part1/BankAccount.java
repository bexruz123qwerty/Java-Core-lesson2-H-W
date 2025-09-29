package com.example.lesson3.part1;

class BankAccount {
    String fio;
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient amount of money");
        }
    }

    double getBalance() {
        return balance;
    }
}