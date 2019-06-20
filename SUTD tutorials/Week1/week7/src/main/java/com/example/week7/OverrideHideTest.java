package com.example.week7;

// overriding vs hiding in Java

public class OverrideHideTest {
    public static void main(String[] args) {
        GeometricObject f = new Circle();
        f.instanceMethod(); //when you call instance aka overridden method, it runs according to right side.
        //it calls a non-static method. It is what you call run-time polymorphism.
        //so until it is run, then program knows its a circle.

        //dynamic binding, complier not able to resolve the binding at compile time.
        //also called late binding, binding happens during run time.
        //eg. method overridding


        f.classMethod();    //when you call static/private/final methods aka static method / or when you run overloaded methods, it runs according to the left side.
        //Hiding - early binding

        //Binding which can be resolved at compile time by compiler.
        //also called early binding, binding happens before a program actually runs.
        //eg. Method overloading
    }
}

class GeometricObject {
    public static void classMethod() {
        System.out.println("classMethod() in GeometricObject");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in GeometricObject");
    }
}

class Circle extends GeometricObject {

    public static void classMethod() {
        System.out.println("classMethod() in Circle");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in Circle");
    }
}