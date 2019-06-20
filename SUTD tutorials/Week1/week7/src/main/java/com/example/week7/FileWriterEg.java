package com.example.week7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEg {
    //Here we learn about Java IO and beyond. Based on Java masterclass on Udemy
    public static void main(String[] args) throws IOException {
        //FileWriter fw = null; //here we changed FileWriter to BufferedWriter
        BufferedWriter fw = null;
        try {
            fw = new BufferedWriter(new FileWriter("C:/Users/benja/AndroidStudioProjects/Week1/week7/src/main/java/com/example/week7/filewriter.txt"));
            for (int i = 0; i <= 100; i++) {
                fw.write(i + "\n");
            }

        }
        // we can comment this out because we already declared that we are throwing an exception
//        catch (IOException e) {
//            System.out.println("In catch block");
//            e.printStackTrace();
//        }
        finally {
            try {
                if (fw != null) {
                    System.out.println("Attempting to close fw.");
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //here we do FileReader
        /*
        Scanner scanner = null;
        try{

            scanner = new Scanner(new FileReader("C:/Users/benja/AndroidStudioProjects/Week1/week7/src/main/java/com/example/week7/filewriter.txt"));
            while(scanner.hasNextLine()) {
                int num = scanner.nextInt();
                System.out.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        } */

        //here we do BufferedReader. ITS FASTER!
        Scanner scanner = null;
        try{

            scanner = new Scanner(new BufferedReader(new FileReader("C:/Users/benja/AndroidStudioProjects/Week1/week7/src/main/java/com/example/week7/filewriter.txt")));
            while(scanner.hasNextLine()) {
                String str = scanner.nextLine();
                int num = Integer.parseInt(str); // vs scanner.nextInt() that will give error.
                System.out.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }



        //Try with exception. no need to close, and also auto throws exception
//        try (java.io.FileWriter fw2 = new java.io.FileWriter("C:/Users/benja/AndroidStudioProjects/Week1/week7/src/main/java/com/example/week7/filewriter2.txt")) {
//            for (int i = 0; i <= 100; i++) {
//                fw2.write(i + "\n");
//
//            }
//
//        }
    }
}