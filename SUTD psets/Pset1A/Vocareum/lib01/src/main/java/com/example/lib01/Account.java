package com.example.lib01;
// ATTENTION
// just edit this file
// TestAccount.java contains the test cases provided in the problem set
// Put in any import statements that you need


import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private static double annualInterestRate = 0.0d;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.dateCreated = new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double newannualInterestRate) {
        annualInterestRate = newannualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public static double getMonthlyInterestRate() {
        double monthyrate = getAnnualInterestRate() / 12;
        return monthyrate;

    }

    public double getMonthlyInterest() {
        double monthlyrate = getMonthlyInterestRate();
        double monthyint = monthlyrate * this.balance / 100;
        return monthyint;
    }

    public void withdraw(double amt) {
        this.balance -= amt;
    }

    public void deposit(double amt) {
        this.balance += amt;
    }


}
