package com.example.lib.TestGenerics;

public class Guest {
    public static void main(String[] args) {
        //make a glass that holds juice
        Glass<Juice> g = new Glass<>();
        Juice juice = new Juice();
        g.liquid = juice;


        //make a glass that holds water
        Glass<Water> waterg = new Glass<>();
        Water water = new Water();
        waterg.liquid = water;



        //to retrieve
        Water retrievedWater = waterg.liquid;


    }
}
