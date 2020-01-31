package main.java.com.olehhilchenko.javadesigntemplates.structural.facade;

public class JobRunner {

    public static void main(String[] args) {
        ManufacturingProcess manufacturingProcess = new ManufacturingProcess();

        manufacturingProcess.doJob();
    }
}
