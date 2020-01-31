package main.java.com.olehhilchenko.javadesigntemplates.structural.facade;

public class Locksmith {

    public void receiptOfWorkpiece(){
        System.out.println("Obtaining a blank for the manufacture of the product...");
    }

    public void blankPreparation(){
        System.out.println("Preparation of the workpiece for welding...");
    }

    public void treatment(){
        System.out.println("Processing of the product after welding...");
    }
}
