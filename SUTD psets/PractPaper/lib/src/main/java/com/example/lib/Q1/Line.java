package com.example.lib.Q1;


public class Line implements Comparable<Line> {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Line() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 1;
        this.y2 = 1;
    }

    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double computeSlope() {
        return (this.y2 - this.y1) / (this.x2 - this.x1);
    }

    public double computeLength() {
        return Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));
    }


    public String toString() {
        return "Line:(" + this.x1 + "," + this.y1 + ")" + ";(" + this.x2 + "," + this.y2 + ")";
    }

    @Override
    public int compareTo(Line line) {
        return Double.compare(this.computeLength(), line.computeLength());
    }
}
