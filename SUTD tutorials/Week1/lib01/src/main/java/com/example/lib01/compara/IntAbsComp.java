package com.example.lib01.compara;

import java.util.Comparator;
//COMPARATOR, compare
//Unlike Comparable, Comparator is external to the element type we are comparing.
//It’s a separate class. We create multiple separate classes (that implement Comparator) to compare by different members.
public class IntAbsComp implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {  //notice two inputs, and we use compare
        a = Math.abs(a);
        b = Math.abs(b);

//        if (a > b) {
//            return 1;
//        }
//        else if (a==b) {
//            return 0;
//        }
//        else {
//            return -1;
//        }
        return a - b;
        //alternatively we can use Double.compare() or Integer.compare()
    }
}
