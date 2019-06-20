package com.example.lib.StratDesignPatt;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    String name;
    public Duck(){
    }
    public Duck(String name){
        this.name = name;
    }
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public abstract void display();
}

class MallardDuck extends Duck {
    MallardDuck(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("I am " + name + ", the Mallard Duck");
    }
}

