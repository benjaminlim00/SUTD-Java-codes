package com.example.lib.AdapterDesignPatt;

public class MyTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("im a turkey and i gobble");
    }

    @Override
    public void fly() {
        System.out.println("i can't really fly..");
    }
}
