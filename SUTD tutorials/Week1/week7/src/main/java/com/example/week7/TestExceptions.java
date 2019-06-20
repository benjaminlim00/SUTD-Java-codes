package com.example.week7;

public class TestExceptions {
    public static void main(String[] args){
        try{
            f(-1);
            System.out.print("R");
        }catch(Exception e){
            System.out.print("S") ; // HERE
        }
    }
    static void f(int x) throws Exception {
        if( x < 0) throw new Exception("exception 2 is thrown"); //thrown to nearest catch block
        System.out.print("P"); //not run
    }
}