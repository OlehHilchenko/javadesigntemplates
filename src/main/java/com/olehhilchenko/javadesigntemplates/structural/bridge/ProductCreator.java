package main.java.com.olehhilchenko.javadesigntemplates.structural.bridge;

public class ProductCreator {
    public static void main(String[] args) {
        Product[] products = {
                new GarageFrame(new MMAWelder()),
                new KitchenTable(new TIGWelder()),
                new Barbecue(new MIGMAGWelder())
        };

        for(Product product : products)
            product.weldingParts();
    }
}
