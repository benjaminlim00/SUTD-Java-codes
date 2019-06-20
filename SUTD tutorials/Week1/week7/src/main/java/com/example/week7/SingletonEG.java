package com.example.week7;

public class SingletonEG {


    public static void main(String[] args) {
        Abc obj1 = Abc.getInstance();
        //only get instance will work. And it returns the same object.
    }
}
class Abc {
    static Abc obj = new Abc();
    private Abc() {

    }
    //can be named anything else
    public static Abc getInstance() {
        return obj;
    }

    //only getInstance can return Abc class.
    //hence singleton

}