package com.example.lib.Q3;

import java.util.ArrayList;
import java.util.HashMap;

public class TimeFinishAssignment {

    public static void main(String[] args) {
        ArrayList<Integer> listOfAssignment = new ArrayList<>();
        listOfAssignment.add(3);
        listOfAssignment.add(4);
        listOfAssignment.add(3);
        listOfAssignment.add(5);
        listOfAssignment.add(6);
        listOfAssignment.add(2);
        listOfAssignment.add(9);
        listOfAssignment.add(2);

        System.out.println(computeTimeFinish(listOfAssignment));
        // output: 15

    }



    public static int computeTimeFinish(ArrayList<Integer> l) {



        HashMap<String, Integer> timetable = new HashMap<>();
        timetable.put("a",0);
        timetable.put("b",0);
        timetable.put("c",0);
        int days = 0;


        //for testings to see contents of timetable
        for (int i: l) {
            for (String name: timetable.keySet()) {
                System.out.println(name + ", " + timetable.get(name));
            }
            System.out.println("\n");

            //DECREMENTS EVERYDAY
//            if (timetable.get("a") != 0) {
//                timetable.put("a", timetable.get("a") - 1);
//            }
//            if (timetable.get("b") != 0) {
//                timetable.put("b", timetable.get("b") - 1);
//            }
//            if (timetable.get("c") != 0) {
//                timetable.put("c", timetable.get("c") - 1);
//            }


            if (timetable.get("a") == 0) {
                timetable.put("a", i);
            }
            else if (timetable.get("b") == 0) {
                timetable.put("b", i);
            }
            else if (timetable.get("c") == 0) {
                timetable.put("c", i);
            }

            else if (timetable.get("a") != 0 && timetable.get("b") != 0 && timetable.get("c") != 0) {  //all filled
                int min = Math.min(timetable.get("a"),timetable.get("b"));
                min = Math.min(min, timetable.get("c")); // min is the smallest number
                days += min; // add min to days, then sub min from all.
                timetable.put("a", timetable.get("a") - min);
                timetable.put("b", timetable.get("b") - min);
                timetable.put("c", timetable.get("c") - min);
                boolean alrDone = false;
                for (String name: timetable.keySet()) {
                    if (!alrDone) {
                        if (timetable.get(name) == 0 ){
                            timetable.put(name, i);
                            alrDone = true;
                        }
                    }

                }
                // now i check if there is another space with 0.



            }
            else {
                System.out.println("error!!");
            }



        }

        for (String name: timetable.keySet()) {
            System.out.println(name + ", " + timetable.get(name));
        }
        System.out.println("\n");

        int max = Math.max(timetable.get("a"), timetable.get("b")); //in the last round, we just take the biggest number and add to days
        max = Math.max(max, timetable.get("c"));
        days += max;
        if (l.size() > 3) {
            return days - 2;

        }

        return days;
    }



}
