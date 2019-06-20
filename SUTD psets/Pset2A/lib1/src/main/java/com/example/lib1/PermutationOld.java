package com.example.lib1;


import java.util.ArrayList;

public class PermutationOld {
    private final String in;
    private ArrayList<String> a = new ArrayList<String>();




    PermutationOld(final String str){
        in = str;
        // additional initialization if needed

    }

    /*
    public static ArrayList<String> permutesRecur(String str, ArrayList<Integer> indices) {
        ArrayList<String> toReturn = new ArrayList<>();

        int length = str.length();
        if (indices.size() == length) {
            toReturn.add("");
            return toReturn;
        }

        for (int i = 0; i < length; i++) {
            if (indices.contains(i)) {
                continue;
            }

            ArrayList<Integer> newIndices = new ArrayList<>();
            for (int index: indices) {
                newIndices.add(index);
            }
            newIndices.add(i);

            ArrayList<String> permutations = Permutation.permutesRecur(str, newIndices);

            for (String stri: permutations) {
                toReturn.add(str.charAt(i), stri);
            }


        }
        return toReturn;

    }

    public void permute(){
        // produce the permuted sequence of 'in' and store in 'a', recursively

        ArrayList<String> returnedVal = permutesRecur(this.in, new ArrayList<Integer>());
        this.a = returnedVal;

    }
*/

    public ArrayList<String> getA(){
        return a;
    }
}
