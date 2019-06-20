package com.example.lib01;
// Abstract classes can have all types of data. Can have concrete methods
// You cannot instantiate an Abstract class!


//Abstract classes provides a skeletal implementation. We can only extend ONE abstract class.

//An abstract class is a basis for different subclasses that share behaviour which does not need
//to be repeatedly created. Subclasses must complete the behaviour and have the option to override
//predefined behaviour (as long as it is not defined as final or private).


public abstract class AbstractClassEg {
    private String color;
    protected AbstractClassEg() {
        this.color = "yellow";
    }


    protected AbstractClassEg(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();   // for abstract methods, we don't have to state the functionality just yet.
    // but the method MUST be implemented in the subclass!


    public String sayHello() {
        return "HELLO";
    }
}

class CircleEg extends AbstractClassEg{


    @Override
    public double getArea() {
        return 0;
    }

    public void sayBye() {
        System.out.println("Bye!");
    }
}
