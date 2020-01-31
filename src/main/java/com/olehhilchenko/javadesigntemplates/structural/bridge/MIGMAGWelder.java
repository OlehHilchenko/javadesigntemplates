package main.java.com.olehhilchenko.javadesigntemplates.structural.bridge;

public class MIGMAGWelder implements Welder {

    @Override
    public void weldingWork() {
        System.out.println("Mechanized welding with an uncoated electrode in a shielding gas environment");
    }
}
