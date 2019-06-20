package com.example.lib.Q1;


import java.util.Comparator;

public class LineSlopeComparator implements Comparator<Line> {
     //TODO: IMPLEMENT CLASS 


    @Override
    public int compare(Line line, Line t1) {
        if (line.computeSlope() > t1.computeSlope()) {
            return 1;
        }
        if (line.computeSlope() == t1.computeSlope()) {
            return 0;
        } else {
            return -1;
        }

    }


}
