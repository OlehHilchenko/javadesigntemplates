package main.java.com.olehhilchenko.javadesigntemplates.behavioral.state;

public class Sleeping implements Action {
    @Override
    public void doIt() {
        System.out.println("I am sleep...");
    }
}
