package com.example.week7;

public class Point2D {
    private int x;
    private int y;



    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point2D{
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
