package com.example.week7;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serializable implements java.io.Serializable {
    private long serialVersionUID = 1;

    public static void main(String[] args) throws IOException {
        ObjectOutputStream fw = null;
        try {
            fw = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("C:/Users/benja/AndroidStudioProjects/Week1/week7/src/main/java/com/example/week7/filewriter.dat")));
            for (int i = 0; i <= 100; i++) {
                fw.writeObject(i);
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

        try(ObjectInputStream fr = new ObjectInputStream(new BufferedInputStream(new FileInputStream("C:/Users/benja/AndroidStudioProjects/Week1/week7/src/main/java/com/example/week7/filewriter.dat")))) {
            boolean eof = false;
            while (!eof) {
                try {
                    int num = (int) fr.readObject(); // we need to cast because object is of type object
                    System.out.println(num);
                } catch (EOFException e) {
                    System.out.println("EOF error"); //this is how to break out of loop
                    eof = true;
                }

            }
        }   catch (IOException e) {
            System.out.println("IO error");
        }   catch (ClassNotFoundException e) {
            System.out.println("Class not found"); // if the object not of type int
        }
    }
}
