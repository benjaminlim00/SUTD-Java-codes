package com.example.lib1;

public class Octagon implements Comparable<Octagon> {
    private double side;
    public Octagon(double side){
        this.side = side;
    }
    public double getSide() {
        return side;
    }

    @Override
    public int compareTo(Octagon o) {
        return Double.compare(this.side, o.side);
    }
}