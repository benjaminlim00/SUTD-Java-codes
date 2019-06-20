package com.example.lib1.MidTerms.Midterms.Qns3;

import java.util.ArrayList;

public interface Observer {
    void update(int t);
}

//public RMB THIS
class Fish implements Observer {
    private String id;
    private Subject subject;

    public Fish(String id, Subject subject) {
        this.id = id;
        this.subject = subject;
        this.subject.register(this);

    }

    @Override
    public void update(int t) {
        System.out.println("Fish " + this.id + " receives temperature alert: " + t);
    }
}

//public
class Student implements Observer {
    private String id;
    private Subject subject;

    public Student(String id, Subject subject) {
        this.id = id;
        this.subject = subject;
        this.subject.register(this);

    }

    @Override
    public void update(int t) {
        System.out.println("Student " + this.id + " receives temperature alert: " + t);
    }
}

//public
interface Subject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();

}

//public
class TemperatureAlert implements Subject{
    private ArrayList<Observer> ls = new ArrayList<>();
    private int temperature;

    public TemperatureAlert() {
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }


    @Override
    public void notifyObservers() {
        if (this.temperature > 35 || this.temperature < 10) {
            for (Observer o: ls) {
                o.update(this.temperature);
            }
        }
    }

    @Override
    public void register(Observer o) {
        ls.add(o);

    }

    @Override
    public void unregister(Observer o) {
        ls.remove(o);
    }
}


