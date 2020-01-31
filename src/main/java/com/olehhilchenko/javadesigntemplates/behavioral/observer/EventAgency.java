package main.java.com.olehhilchenko.javadesigntemplates.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventAgency implements Observed{
    List<String> events = new ArrayList<>();
    List<Observer> participant = new ArrayList<>();

    public void addEvent (String event){
        this.events.add(event);
        notifyObservers();
    }

    public void removeEvent (String event){
        this.events.remove(event);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.participant.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.participant.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: participant)
            observer.handleEvent(this.events);
    }
}
