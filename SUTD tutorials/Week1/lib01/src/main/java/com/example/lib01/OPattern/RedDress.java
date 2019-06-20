package com.example.lib01.OPattern;

import java.util.ArrayList;
import java.util.Observer;

public class RedDress implements Observable{
    private ArrayList<Observer> users = new ArrayList<Observer>();
    private boolean inStock = true;

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
        notifyObserver();
    }



    @Override
    public void addObserver(com.example.lib01.OPattern.Observer o) {

    }

    @Override
    public void removeObserver(com.example.lib01.OPattern.Observer o) {

    }

    @Override
    public void notifyObserver() {
        for (Observer user: users) {
            //user.update();
        }
    }
}
