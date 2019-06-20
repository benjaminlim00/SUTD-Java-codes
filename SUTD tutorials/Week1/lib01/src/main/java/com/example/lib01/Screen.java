package com.example.lib01;

public class Screen {
    int height;
    int width;

    public Screen(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void drawsomething() {
        System.out.println("Drawing on screen");
    }
}
