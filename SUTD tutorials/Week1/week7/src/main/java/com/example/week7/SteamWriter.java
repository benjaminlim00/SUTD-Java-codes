package com.example.week7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SteamWriter {
    public static void main(String[] args) throws IOException {
        DataOutputStream fw = null;
        try {
            fw = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:/Users/benja/AndroidStudioProjects/Week1/week7/src/main/java/com/example/week7/filewriter.dat")));
            for (int i = 0; i <= 100; i++) {
                fw.writeInt(i);
                //fw.writeUTF(); to write String
            }
        }


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

        try(DataInputStream fr = new DataInputStream(new BufferedInputStream(new FileInputStream("C:/Users/benja/AndroidStudioProjects/Week1/week7/src/main/java/com/example/week7/filewriter.dat")))) {
            boolean eof = false;
            while (!eof) {
                try {
                    int num = fr.readInt();
                    System.out.println(num);
                } catch (EOFException e) {
                    System.out.println("EOF error"); //this is how to break out of loop
                    eof = true;
                }

            }
        }
        catch (IOException e) {
            System.out.println("IO error");
        }
        }
    }
