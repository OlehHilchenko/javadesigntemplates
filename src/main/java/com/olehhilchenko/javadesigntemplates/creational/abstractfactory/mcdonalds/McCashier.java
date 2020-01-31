package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.mcdonalds;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.Cashier;

public class McCashier implements Cashier {
    @Override
    public void countCustomer() {
        System.out.println("Cashier count mcdonalds clients...");
    }
}
