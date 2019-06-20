package com.example.lib;

public class A {
    String s = "AAA";

    static void methodA() {
        System.out.println("this works");
    }

    static class B {
        void methodB() {        // this only works if methodA is static
            methodA();
        }
    }
}
