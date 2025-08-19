package com.aln.day2;

public class Account {

    private String accNumber;
    private String name;
    private double balance;

    public Account(String accNumber, String name,  double balance) {
       this.accNumber = accNumber;
       this.name = name;
       this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount > balance) {
            System.out.println("Insufficient Balance");
        }
        this.balance -= amount;
        System.out.println("Account has been debited with amount: " + amount+" and balance is: " + balance);
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Account has been credited with amount: " + amount+" and balance is: " + balance);
    }

    public void showDetails(){
        System.out.println("Account Number: " + accNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    public String getAccNumber() {
        return accNumber;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}
