package main.java.com.olehhilchenko.javadesigntemplates.behavioral.strategy;

public class Sleeping implements Action {
    @Override
    public void doIt() {
        System.out.println("I am sleep...");
    }
}
