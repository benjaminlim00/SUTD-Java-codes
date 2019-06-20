package com.example.lib.StratDesignPatt;

public interface FlyBehavior {
    void fly();
}

class FlapWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flapping my Wings");
    }
    }
