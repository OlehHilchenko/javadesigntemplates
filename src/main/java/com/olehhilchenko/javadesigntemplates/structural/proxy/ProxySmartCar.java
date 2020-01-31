package main.java.com.olehhilchenko.javadesigntemplates.structural.proxy;

public class ProxySmartCar implements ProductDrawing{

    private String modelCar;
    private SmartCar smartCar;

    public ProxySmartCar(String modelCar) {
        this.modelCar = modelCar;
    }

    @Override
    public void createProduct() {
        if(smartCar == null){
            smartCar = new SmartCar(modelCar);
        }
        smartCar.createProduct();
    }
}
