package com.example.week7;

public class TestExceptionsThree {
    public static void main(String[] args) {
        try {
            double a = quotientDouble(5d,0d);
            System.out.println(a);
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
    }

    public static int quotientInt(int a, int b) {
        return a/b;
    }

    public static double quotientDouble(double a, double b) throws ArithmeticException{
        //no exception, so we need to throw one
        if (Math.abs(b) <= 1e-10)
            throw new ArithmeticException("Divide by zero");

        return a / b;
        }
    }

