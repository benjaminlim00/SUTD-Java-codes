package com.example.week7;

public class override2 {
    static class A {
        void f(int x) {
            System.out.println("Af");
        }

        void h(int x) {
            System.out.println("Ah");
        }
    }

    static class B extends A {
        @Override
        void f(int x) {
            System.out.println("Bf");
        }

        void g(int x) {
            System.out.println("Bg");
        }
    }


    public static void main(String[] args) {
        A x = new B(); //Variable of type A, so can only use methods of A. But it is object of B.
        x.f(5); // We get Bf!!!!!!!!!!
        x.h(5);
    }
}