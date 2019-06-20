package com.example.lib01;
// In interface, all data are public static final, all methods are abstract

//Interfaces are like a recipe. We can implement many interfaces.

//An interface is a description of the behaviour an implementing class will have.
//The implementing class ensures, that it will have these methods that can be used on it.
//It is basically a contract or a promise the class has to make.


public class InterfaceEg {
    Eatable chinaChicken = new Chicken();  //we can do this!

}

interface Eatable {
    public abstract String howToEat();
}

class AnimalI {

}
class Chicken extends AnimalI implements Eatable {
    public String howToEat() {
        return "fried chicken yum";
    }
}

class Chocolate implements Eatable {
    String brand;

    public Chocolate(String brand) {
        this.brand = brand;
    }

    public String howToEat() {
        return "lick it";
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return this.brand;
    }
}

//Check out HumanForI