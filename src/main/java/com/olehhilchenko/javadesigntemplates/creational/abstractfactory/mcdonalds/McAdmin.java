package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.mcdonalds;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.Administrator;

public class McAdmin implements Administrator {
    @Override
    public void manageShift() {
        System.out.println("Admin manages the restaurant shift...");    }
}
