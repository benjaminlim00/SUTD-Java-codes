package com.example.lib01.p1;

import com.example.lib01.p2.C2;

public class C1 {

    public static void main(String[] args) {
        C2 x = new C2();

        x.f1(); // no error because declared public
        //x.f2(); error because not public
    }

}
