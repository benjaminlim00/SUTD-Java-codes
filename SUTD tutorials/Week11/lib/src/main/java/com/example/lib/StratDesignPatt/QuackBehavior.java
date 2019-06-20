package com.example.lib.StratDesignPatt;

public interface QuackBehavior {
    void quack();
}

class LoudQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("QUACK");
    }
}