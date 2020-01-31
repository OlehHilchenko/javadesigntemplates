package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.mcdonalds;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.Cook;

public class McCook implements Cook {
    @Override
    public void toCook() {
        System.out.println("Cook, cook mcdonalds menu...");
    }
}
