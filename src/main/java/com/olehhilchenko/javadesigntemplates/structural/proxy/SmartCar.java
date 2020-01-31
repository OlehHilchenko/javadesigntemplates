package main.java.com.olehhilchenko.javadesigntemplates.structural.proxy;

public class SmartCar implements ProductDrawing {


    private String modelCar;

    public SmartCar(String modelCar) {
        this.modelCar = modelCar;
        createPrototype();
    }

    public void createPrototype(){
        System.out.println("Create main.java.com.olehhilchenko.javadesigntemplates.creational.prototype of " + modelCar + " car..." );
    }

    @Override
    public void createProduct() {
        System.out.println("Create a series of " + modelCar + " car...");
    }
}
