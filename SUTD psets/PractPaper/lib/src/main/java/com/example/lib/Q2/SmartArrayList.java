package com.example.lib.Q2;
// this doesn't work, check out ans in Ans

import java.util.Arrays;

public class SmartArrayList {
    private static final int INIT_CAPACITY = 2;
    private int size=0;  // no of element stored
    private String[] data = new String[INIT_CAPACITY]; // where the element stored


    public SmartArrayList() {

    }

    public void add(int index, String s) {
        // check 0<= index <= size
        // when index == size, append to the end
        if (index == size) {
            boolean quit = false;
            for (int i = 0; i <INIT_CAPACITY; i++) {
                if (!quit) {    // we only add once
                    if (data[i] == null) {
                        data[i]= s;
                        quit = true;
                    }
                }

            }
        }


        if (index >= 0 && index <= this.size) {
            if (size == INIT_CAPACITY) {
                data = Arrays.copyOf(data, INIT_CAPACITY * 2); //doubled the size
            }

            for (int i = size - 1; i <= index; i--) { //shifting to the right
                data[i + 1] = data[i];
            }
            data[index] = s;
            size += 1;

        }
    }

    public void add(String s) {
        boolean quit = false;
        boolean hasNotNull = false;
        for (int i = 0; i <INIT_CAPACITY; i++) {
            if (!quit) {    // we only add once
                if (data[i] == null) {
                    data[i]= s;
                    quit = true;
                    hasNotNull = true;
                }
            }

        }
        if (!hasNotNull){    //if there is no null, we got to expand the list.
            add( size - 1, s);
        }
        size ++;
        System.out.println(size);
    }
//
//    public String get(int index) {
//        // TODO: IMPLEMENT THE METHOD
//
//
//    }
//
//    public void set(int index, String s){
//        // TODO: IMPLEMENT THE METHOD
//
//    }
//
//    public void remove(int index) {
//        // TODO: IMPLEMENT THE METHOD
//
//    }
//
    @Override
    public String toString(){
        return Arrays.toString(this.data);
    }


}
