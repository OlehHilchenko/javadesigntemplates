package main.java.com.olehhilchenko.javadesigntemplates.structural.bridge;

public class Barbecue extends Product {

    public Barbecue(Welder welder) {
        super(welder);
    }

    @Override
    void weldingParts() {
        System.out.println("Barbecue in manufacturing process");
        welder.weldingWork();
    }
}
