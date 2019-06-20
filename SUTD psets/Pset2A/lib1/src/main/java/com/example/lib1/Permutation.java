package com.example.lib1;


import java.util.ArrayList;

public class Permutation {
    private final String in;
    private ArrayList<String> a = new ArrayList<>();

    Permutation(final String str){
        in = str;
    }

    public void permute(){

        if (in.length()<=1){
            a.add(in);
        }
        else{
            for (int i=0; i<in.length(); i++){ // elements of substring rotate as the first entry
                String s = in.substring(0, i)+in.substring(i+1);
                Permutation sub = new Permutation(s);
                sub.permute();

                for (String perParts :sub.getA()){ // followed by the permutations elements excluding i
                    a.add(in.charAt(i)+perParts);
                }
            }
        }
    }

    public ArrayList<String> getA(){
        return a;
    }
}