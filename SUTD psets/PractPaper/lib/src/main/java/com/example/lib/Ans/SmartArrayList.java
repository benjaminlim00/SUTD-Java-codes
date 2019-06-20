package com.example.lib.Ans;

/**
 * Created by ngaiman_cheung on 21/9/17.
 */

public class SmartArrayList {
    private static final int INIT_CAPACITY = 2;
    private int size=0;
    private String[] data = new String[INIT_CAPACITY];


    public SmartArrayList() {

    }

    public void add(int index, String s) {
        // assume index <= size
        // when index == size, append to the end

        if ((index < 0) || (index > size))
            return;

        // check capacity, if full make a new array with bigger size
        checkCapacity();

        //we iterate from the end. shifts everything right
        for (int i = size-1; i >= index; i--) {
            data[i+1] = data[i];
        }

        data[index] = s;    //insert s at index

        size++; //increment size by 1.

    }

    public void add(String s) {
        add(size, s);
    }   //same as adding at index size, which is the 1 after the last position of the []

    public String get(int index) {
        if ((index<0) || (index>=size))
            return null;

        return data[index];

    }

    public void set(int index, String s){
        if ((index<0) || (index>=size))
            return;
        data[index] = s;
    }

    public void remove(int index) {
        if ((index<0) || (index>=size))
            return;

        for (int j=index; j< size -1; j++)  //iterate in reverse
            data[j] = data[j+1];    //this shifts left. data [index] is overwritten.

        data[size-1] = null;    //the last item is replaced with null
        size--; //size decremented

    }

    @Override
    public String toString(){
        String s = "[";
        for (int k =0; k<size-1; k++) {
            s += data[k] +",";
        }
        s+=data[size-1]+"]";
        return s;
    }


    private void checkCapacity() {
        if (size >= data.length) {  //more items to be put inside than it can hold. Or that it will be full.
            String[] newData = new String[2 * data.length]; //make new data array with double the size
            for (int k=0; k< data.length; k++) {
                newData[k] = this.data[k];  //copy over the data that exists

            }
            this.data = newData;    //make data = the newdata

        }

    }

}
