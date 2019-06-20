package com.example.lib;

public class MyClass {
    public static void main(String[] args) {
        QuadraticEquation test = QuadraticEquation.getEquationGenerator(23, 123);

        System.out.println(test.getTwoRoots());

    }
}
