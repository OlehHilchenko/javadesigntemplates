package main.java.com.olehhilchenko.javadesigntemplates.structural.proxy;

public class SeriesRunner {
    public static void main(String[] args) {
        ProductDrawing productDrawing = new ProxySmartCar("Sport car ML");

        productDrawing.createProduct();
    }
}
