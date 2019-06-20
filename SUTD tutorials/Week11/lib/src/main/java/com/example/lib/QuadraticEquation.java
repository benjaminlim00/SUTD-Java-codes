package com.example.lib;

import java.util.Random;

public class QuadraticEquation {
    private int aMax;
    private int cMax;


    private QuadraticEquation(int aMax, int cMax) {
        this.aMax = aMax;
        this.cMax = cMax;
    }


    public static QuadraticEquation getEquationGenerator (int aMax, int cMax) {
        return new QuadraticEquation(aMax, cMax);
    }

    public QuadraticCoefficient getTwoRoots() {

        Random rand = new Random();
        int a = rand.nextInt(this.aMax) + 1;
        int c = rand.nextInt(this.cMax) + 1;

        int sum = 4*a*c;
        int b = (int) (Math.sqrt(sum));

        return new QuadraticCoefficient(a,b,c);
    }

    static class QuadraticCoefficient {
        private int a;
        private int b;
        private int c;

        public QuadraticCoefficient(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public int getA() {
            return a;
        }

        public int getB() {
            return b;
        }

        public int getC() {
            return c;
        }

        @Override
        public String toString() {
            return "y = " + getA() + "x^2 + " + getB() + "x + " + getC();
        }
    }
}
