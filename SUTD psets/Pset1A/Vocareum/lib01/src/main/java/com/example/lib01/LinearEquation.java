package com.example.lib01;

public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;


    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    //A method named isSolvable() that returns true if ad - bc is not 0 (why?)
    public boolean isSolvable() {
        return this.a * this.d - this.b * this.c != 0;
    }

    public double getX() {
        double top = this.e - this.f * this.b / this.d;
        double bottom = this.a - this.b * this.c / this.d;
        return top/bottom;
    }

    public double getY() {
        double top = this.e - this.f * this.a / this.c;
        double bottom = this.b - this.d * this.a / this.c;
        return top/bottom;
    }


}
