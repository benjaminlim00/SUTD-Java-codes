package com.example.lib01;

public class MyRectangle2D {
    double x;
    double y;
    double width;
    double height;

    public MyRectangle2D() {
        this.x = 0;
        this.y = 0;
        this.height = 1;
        this.width = 1;
    }

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }

    public double getPerimeter() {
        return 2 * getWidth() + 2 * getHeight();
    }

    public boolean contains(double x, double y) {
        double lx = this.x - this.width/2;
        double rx = this.x + this.width/2;
        double uy = this.y + this.height/2;
        double dy = this.y - this.height/2;

        return x > lx && x < rx && y < uy && y > dy;
    }

    public boolean contains(MyRectangle2D r) {
        if ((this.x + this.width/ 2) > (r.x + r.width/2) &&
                (this.x - this.width/2) < (r.x - r.width/2) &&
        (this.y + this.height/2) > (r.y + r.height/2) &&
                (this.y - this.height/2) < (r.y - r.height/2)) {
    return true;
        } else {
    return false;
        }
    }

    public boolean overlaps(MyRectangle2D r) {

        // If one rectangle is on left side of other
        if (this.x - this.width/2 > r.x + r.width/2 || r.x - r.width/2 > this.x + this.width/2)
            return false;

        // If one rectangle is above other
        if (this.y + this.height/2 < r.y - r.height/2 || r.y + r.height/2 < this.y - this.height/2)
            return false;

        return true;

    }






    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
