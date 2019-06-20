package com.example.lib;

public class TestQuack {
    public static void main(String[] args) {


        Pond.Duck duck = new Pond.Duck();
        int i = duck.quack;


        int i2 = new Pond.Duck().quack;
    }
}

class Pond {
    static class Duck {
        int quack = 111;
    }
}
