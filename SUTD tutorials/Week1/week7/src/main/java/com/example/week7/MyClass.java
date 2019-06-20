package com.example.week7;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;

public class MyClass {
    //Here we learn about Java IO and beyond. Based on Java masterclass on Udemy


    /*
    //static block test
    static String s = "";

    static {
        s = "hello world";
        //because we cannot make constuctor for static parameters, we use static block to act as "constructors"
    }

    public static void main(String[] args) {
        System.out.println("The value of s is: " + s);
    }
    //will go in order of static blocks, then main block
//    static {
//        System.out.println("testing static blk 2");
//    }

    */

    public static void main(String[] args) {
        //How to cast integer to string
//        int n = 12312;
//        String s = Integer.toString(n);
//        System.out.println(s);


        //Using NumberFormat
//        NumberFormat usformat  = NumberFormat.getCurrencyInstance(Locale.US);
//        System.out.println(usformat.format(12321312));


        //Substring of a String
        String s = "Hello world";
        char charAt = s.charAt(4);
        System.out.println(charAt);


    }

}
