package com.example.lib.StratDesignPatt;

import com.example.lib.StratDesignPatt.Duck;
import com.example.lib.StratDesignPatt.FlapWings;
import com.example.lib.StratDesignPatt.LoudQuack;
import com.example.lib.StratDesignPatt.MallardDuck;

public class TestDuck {
    public static void main(String[] args){
        Duck duck = new MallardDuck("Donald");
        duck.setFlyBehavior(new FlapWings());
        duck.setQuackBehavior(new LoudQuack());
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}