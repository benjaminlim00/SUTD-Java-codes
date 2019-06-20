package com.example.lib01;

import java.util.Arrays;
import java.util.HashSet;

public class Pset1 {
    public static boolean isAllCharacterUnique(String sIn) {
        boolean result = false;
        String input = sIn;
        HashSet<Character> hashset = new HashSet<>();
        //true if the element is added to the HashSet<T> object; false if the element is already present.
        for (int i = 0; i < input.length(); i++) {
            result = hashset.add(input.charAt(i));
            if (!result) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermutation(String sIn1, String sIn2) {
        if (sIn1.length() != sIn2.length()) {
            return false;
        }

        char[] a = sIn1.toCharArray();
        char[] b = sIn2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);

    }

}