package main.java.com.olehhilchenko.javadesigntemplates.structural.bridge;

public class MMAWelder implements Welder{

    @Override
    public void weldingWork() {
        System.out.println("Coated electrode welding");
    }
}
