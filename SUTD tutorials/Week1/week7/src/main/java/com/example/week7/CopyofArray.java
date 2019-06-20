package com.example.week7;


// Java program to illustrate copyof method
import java.util.Arrays;

public class CopyofArray
{
    public static void main(String args[])
    {
        // initializing an array original
        String[] org = new String[] {"cat", "dog", "kitty"};

        System.out.println("Original Array");
        for (int i = 0; i < org.length; i++)
            System.out.print(org[i] + " ");

        // copying array org to copy
        String[] copy = Arrays.copyOf(org, 5);


        System.out.println("\nNew array copy after modifications:");
        for (int i = 0; i < copy.length; i++)
            System.out.print(copy[i] + " ");
    }
}