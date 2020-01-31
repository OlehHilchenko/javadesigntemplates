package main.java.com.olehhilchenko.javadesigntemplates.structural.bridge;

public class TIGWelder implements Welder {

    @Override
    public void weldingWork() {
        System.out.println("Nonconsumable electrode welding in argon shielding gas");
    }
}
