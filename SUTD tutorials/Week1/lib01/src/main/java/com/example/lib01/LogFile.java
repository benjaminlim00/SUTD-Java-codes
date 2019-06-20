package com.example.lib01;

//SINGLETON
public class LogFile {
    private static LogFile instance = null;

    private LogFile() { //private constructor

    }

    public static LogFile getInstance() {
        if (instance == null) {
            instance = new LogFile();
        }
        return instance;
    }

    public static void main(String[] args) {
        LogFile l = new LogFile();
        LogFile l2 = new LogFile();
        System.out.println(l);
        System.out.println(l2); //l and l2 are the same

        System.out.println(LogFile.getInstance());
    }

}
