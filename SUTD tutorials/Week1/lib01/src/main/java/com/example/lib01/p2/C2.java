package com.example.lib01.p2;

public class C2 {
    private int inte = 21; //visible only by the declaring class aka only in this file

    public int f1() {//public means visible everywhere
        return 0;
    }
    int f2() {//default means visible only to classes in the same package aka p2
        return 0;

    }

}
