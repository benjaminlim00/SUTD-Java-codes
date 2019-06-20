package com.example.lib01.compara;
//COMPARABLE
public class Circle implements Comparable<Circle>{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }


    public int compareTo(Circle c) {    //notice only has one input, and we use compareTo
        if (this.radius > c.radius) {
            return 1;
        }
        else if (this.radius == c.radius) {
            return 0;
        }
        else {
            return -1;
        }
    }


}
