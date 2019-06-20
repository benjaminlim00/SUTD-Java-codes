package com.example.lib01;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public Triangle() {
        this(1.0,1.0,1.0);
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
        return area;

    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }

}
