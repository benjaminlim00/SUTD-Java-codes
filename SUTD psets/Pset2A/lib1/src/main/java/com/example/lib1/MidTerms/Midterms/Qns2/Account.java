package com.example.lib1.MidTerms.Midterms.Qns2;

import java.util.Date;

public class Account implements Comparable<Account> {
    private String id;
    private double balance;
    private Date dateCreated;

    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Account:" + this.getId();
    }

    @Override
    public int compareTo(Account a) {
        if (this.balance > a.balance) {
            return 1;
        } else if (this.balance == a.balance) {
            return 0;
        } else {
            return -1;
        }
    }
}
