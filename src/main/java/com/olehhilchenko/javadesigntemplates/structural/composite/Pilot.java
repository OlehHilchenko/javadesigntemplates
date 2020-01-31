package main.java.com.olehhilchenko.javadesigntemplates.structural.composite;

public class Pilot implements Aviator {

    @Override
    public void toFly() {
        System.out.println("Pilot a plane ...");
    }
}
