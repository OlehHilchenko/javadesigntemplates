package main.java.com.olehhilchenko.javadesigntemplates.structural.bridge;

public abstract class Product {

    Welder welder;

    public Product(Welder welder) {
        this.welder = welder;
    }

    abstract void weldingParts();
}
