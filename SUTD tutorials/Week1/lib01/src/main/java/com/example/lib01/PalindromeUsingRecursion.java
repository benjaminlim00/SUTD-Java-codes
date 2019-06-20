package com.example.lib01;

import java.util.Arrays;

public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        char[] a = new char[] {'a','a','b','b','a','a'};
        System.out.println(isPalindrome(a));
    }

    /*public static boolean isPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1,s.length() - 2));
        }
        return false;
    }*/

    public static boolean isPalindrome (char[] S) {
        if (S.length == 0 || S.length == 1) {
            return true;
        }
        if (S[0] == S[S.length - 1]) {
            char[] A = Arrays.copyOfRange(S, 1, S.length - 1);
            return isPalindrome(A);
        }
        return false;
    }


}


