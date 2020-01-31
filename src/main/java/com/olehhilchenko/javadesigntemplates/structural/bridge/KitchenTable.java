package main.java.com.olehhilchenko.javadesigntemplates.structural.bridge;

public class KitchenTable extends Product {

    public KitchenTable(Welder welder) {
        super(welder);
    }

    @Override
    void weldingParts() {
        System.out.println("Kitchen table in manufacturing process");
        welder.weldingWork();
    }
}
