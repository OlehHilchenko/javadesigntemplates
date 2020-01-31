package main.java.com.olehhilchenko.javadesigntemplates.behavioral.observer;

public interface Observed {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
