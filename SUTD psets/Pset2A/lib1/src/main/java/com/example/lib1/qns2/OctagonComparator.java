package com.example.lib1.qns2;

import java.util.*;

//Modify the class header to implement the appropriate interface
public class OctagonComparator implements Comparator<Octagon>{

    //then implement the method(s) in the interface

    @Override
    public int compare(Octagon a, Octagon b) {
        return (int) (a.getSide() - b.getSide());
    }
}


