package com.example.lib1;

//**SEE BELOW** modify AirPollutionAlert

import java.util.ArrayList;

interface Observer{
    void update(double airPollutionIndex);
}

class Subscriber implements Observer{
    private Subject subject;
    private String observerId;
    public static String outputMessage = "";

    public Subscriber(String observerId, Subject subject){
        this.subject=subject;
        this.observerId = observerId;
        this.subject.register(this);		// register itself
    }

    @Override
    public void update(double airPollutionIndex) {
        String s = this.observerId + " received notification: " + airPollutionIndex;
        System.out.println(s);
        outputMessage += (s + " ");
    }
}

interface Subject{
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}

//TODO: modify AirPollutionAlert to implement interface Subject, under Observer design pattern
class AirPollutionAlert implements Subject{
    private double airPollutionIndex;
    ArrayList<Observer> people = new ArrayList<Observer>();

    public void setAirPollutionIndex(double airPollutionIndex) {
        this.airPollutionIndex = airPollutionIndex;
        notifyObservers();
    }

    public double getAirPollutionIndex() {
        return airPollutionIndex;
    }

    @Override
    public void register(Observer o) {
        people.add(o);
    }

    @Override
    public void unregister(Observer o) {
        people.remove(o);
    }

    @Override
    public void notifyObservers() {
        if (getAirPollutionIndex() > 100) {
            for (Observer o: people) {
                o.update(this.airPollutionIndex);
            }
        }

    }
}

