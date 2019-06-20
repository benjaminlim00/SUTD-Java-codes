package com.example.lib1.MidTerms.Midterms.Qns1;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle() {
        this(0,0,1);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    public boolean contains(double px, double py) {
        return (px >= (this.x - this.radius) && px <= (this.x + this.radius) && py >= (this.y - this.radius) && py <= (this.y + this.radius));
    }

    public boolean contains(Circle c) {
        return (((this.x + this.radius) > (c.x + c.radius) &&
                (this.x - this.radius) < (c.x - c.radius) &&
                (this.y + this.radius) > (c.y + c.radius) &&
                (this.y - this.radius) < (c.y - c.radius)));
    }

    public boolean overlaps(Circle c) {
        // If one circle is on left side of other
        if (this.x - this.radius > c.x + c.radius || c.x - c.radius > this.x + this.radius)
            return false;

        // If one circle is above other
        if (this.y + this.radius < c.y - c.radius || c.y + c.radius < this.y - this.radius)
            return false;

        return true;
    }

}
