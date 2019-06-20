package com.example.lib01.compara;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Circle circle1 = new Circle(5);
//        Circle circle2 = new Circle(6);
//        System.out.println(circle2.compareTo(circle2));
        //NEW SHORTCUT FOR ARRAYLIST
        List<Integer> x = Arrays.asList(1, 242141, 3,314134); // this is for List only

        ArrayList<Integer> w = new ArrayList<Integer>();
        w.add(100);
        w.add(-500);
        w.add(-20);
        //int[] w = {100, -500, -20}; doesn't work for Arr
        Collections.sort(w, new IntAbsComp());
        System.out.println(w);

        Collections.sort(x, new IntAbsComp());  // we use collections.sort to sort.
        System.out.println(x);

    }
}
