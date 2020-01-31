package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.papajohns;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.Cook;

public class PapaCook implements Cook {
    @Override
    public void toCook() {
        System.out.println("Cook preparing pizza papa john...");
    }
}
