package com.example.lib.Q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        Result r = new Result();
        List<String> ls = new ArrayList<>();
        List<String> ls2 = (List<String>) ((ArrayList<String>) ls).clone();
        ls.add("UP");
        ls.add("DOWN");
        ls.add("RIGHT");
        ls.add("RIGHT");
        ls.add("LEFT");
        ls.add("UP");
        System.out.println(r.roverMove(4, ls));
    }
}





