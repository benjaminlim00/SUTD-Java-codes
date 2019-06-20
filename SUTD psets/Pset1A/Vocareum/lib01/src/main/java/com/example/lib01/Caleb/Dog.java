package com.example.lib01.Caleb;

public class Dog extends Animal{
    int fur;
    public Dog() {
        super(); //Super must be the first thing here
        this.fur = 3;
    }
    public Dog(int fur) {
        super();
        this.fur = fur;
    }
    public Dog(int leg, int eyes, int fur) {
        super(leg, eyes);
        this.fur = fur;
    }

}
