package com.example.lib.AdapterDesignPatt;

import java.util.ArrayList;
public class DuckClient {
    static ArrayList<Duck> myDucks;
    public static void main(String[] args){
        myDucks = new ArrayList<>();
        myDucks.add( new MallardDuck());

        Turkey myTurkey = new MyTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(myTurkey);
        myDucks.add(turkeyAdapter);

        makeDucksFlyQuack();
    }
    static void makeDucksFlyQuack(){
        for(Duck duck: myDucks){
            duck.fly();
            duck.quack();
        }
    }
}