package com.example.lib.AdapterDesignPatt;

public class TurkeyAdapter implements Duck {    //turkey trying to be duck
    Turkey turkey;  //make a turkey
    TurkeyAdapter(Turkey turkey){   //constructor
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        //implement this
        turkey.gobble();
    }
    @Override
    public void fly() {
        turkey.fly();
    }
}
