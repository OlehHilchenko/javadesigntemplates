package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.mcdonalds;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.Manager;

public class McManager implements Manager {
    @Override
    public void runARestaurant() {
        System.out.println("Manager runs a restaurant...");
    }
}
