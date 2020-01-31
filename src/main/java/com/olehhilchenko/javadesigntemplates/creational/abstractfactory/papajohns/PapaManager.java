package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.papajohns;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.Manager;

public class PapaManager implements Manager {

    @Override
    public void runARestaurant() {
        System.out.println("Manager runs a restaurant...");
    }
}
