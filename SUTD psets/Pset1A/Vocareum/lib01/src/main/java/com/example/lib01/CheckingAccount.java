package com.example.lib01;

public class CheckingAccount extends Account {

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amt) {
        if (super.getBalance() - amt >= -5000) {
            super.withdraw(amt);
        } else {
            System.out.println("over limit");
        }
    }

}
