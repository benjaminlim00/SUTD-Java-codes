package com.example.lib01.OPattern;

//import java.util.Observer;

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
