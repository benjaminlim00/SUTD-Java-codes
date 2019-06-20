package com.example.lib01;

public class Circle {
    double radius;
    static int numOfCircleCreated;
    //The static keyword denotes that a member variable, or method, can be accessed
    //without requiring an instantiation of the class to which it belongs.

    static final int degrees = 360;
    //Final keyword only allows a single assignment for the variable.
    // That is to say, once the variable has been assigned, its value is in read-only.

    public Circle() { //no return type needed in constructor, not even void.
        this.radius = 3.0;
        numOfCircleCreated++;
    }

    Circle(double newRadius) {
        this.radius = newRadius;
    }

    public double getArea() {
        return this.radius * this.radius * 3.14159;
    }
}