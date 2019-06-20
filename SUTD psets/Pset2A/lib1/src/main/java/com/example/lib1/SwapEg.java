package com.example.lib1;

public class SwapEg {
    public static void main(String[] args) {
        int a =123;
        int b =2222;
        swap(a,b); // here need to retrieve data. edit
        System.out.println(a);
        System.out.println(b);
    }
    public static int[] swap(int a, int b) {
        int temp = a;
        b = temp;
        a = temp;
        int[] ans = {a,b};
        return ans;
        // have to return the values in this case an array.
    }


}
