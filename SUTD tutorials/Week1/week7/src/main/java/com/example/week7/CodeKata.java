package com.example.week7;

import java.util.ArrayList;
import java.util.HashMap;

public class CodeKata {
    public static void main(String[] args) {
        int[] intar = {1,2,3,4,3,2,1};      //shortcut of int[] intar = new int[3], int[0] = 12312....
        System.out.println(Kata.findEvenIndex(intar));

    }
}
//public class FindOdd {
////    public static int findIt(int[] a) {
////        HashMap<Integer, Integer> map = new HashMap<>();
////        for (int i : a) {
////            if (!map.containsKey(i)) {
////                map.put(i, 1);
////            }   else {
////                map.put(i, map.get(i) + 1);
////            }
////
////        }
////
////        int ans = 0;
////        for (int i: map.keySet()) {
////            if (map.get(i) % 2 != 0) {
////                ans = i;
////            }
////        }
////        return ans;
////    }
////}

class Kata {
    public static int findEvenIndex(int[] arr) {
        for (int i = 0 ; i < arr.length; i++) {
            int leftsum = leftSum(i, arr);
            int rightsum = rightSum(i, arr);

            if (leftsum == rightsum) {
                return i;
            }
        }
        return -1;
    }
    static int leftSum(int i, int[] arr) {
        int sum = 0;
        for (int j = 0; j < i; j ++) {
            sum += arr[j];
        }
        return sum;
    }
    static int rightSum(int i, int[] arr) {
        int sum = 0;
        for (int j = arr.length - 1; j > i; j --) {
            sum += arr[j];
        }
        return sum;
    }

}