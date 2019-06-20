package com.example.lib;

public class qns1 {
    public static void main(String[] args) {
        B.methodB();

        Pondtest.Duck ducky = new Pondtest.Duck();  //this is qns 2, how we access static class.



    }

    static class B{ //class b must be static to have static method
        static void methodB(){
            System.out.println("Method B");
        }
    }


}

class Pondtest {
    static class Duck {
        int quack = 111;
    }
}