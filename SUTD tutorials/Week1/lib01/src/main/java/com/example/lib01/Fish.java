package com.example.lib01;

public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;


    //WE USE SUPER TO CALL THE PARENT CLASS CONSTRUCTOR
    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    /*
    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
     */

    private void rest(){
        System.out.println("resting...");
    }
    private void swim(int speed) {
        movemuscles();
        movebackfin();
        super.move(speed);
    }

    private void movemuscles() {
        System.out.println("Moving muscles");

    }

    private void movebackfin() {
        System.out.println("Moving backfin");
    }


}
