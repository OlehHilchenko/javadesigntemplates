package main.java.com.olehhilchenko.javadesigntemplates.structural.bridge;

public class GarageFrame extends Product{

    public GarageFrame(Welder welder) {
        super(welder);
    }

    @Override
    void weldingParts() {
        System.out.println("Garage frame in manufacturing process");
        welder.weldingWork();
    }
}
