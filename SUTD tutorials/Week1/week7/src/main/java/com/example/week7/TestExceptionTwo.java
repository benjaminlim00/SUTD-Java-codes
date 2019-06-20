package com.example.week7;

public class TestExceptionTwo {
    public int divide() {
        int x = 0;
        int y = 4;

        try {
            int result = x/y;
            return result;
        } catch(ArithmeticException e){
            throw new ArithmeticException("cannot divide by 0");
        }

    }

    public static void main(String[] args) {
        TestExceptionTwo t = new TestExceptionTwo();
        System.out.println(t.divide());
    }
}
