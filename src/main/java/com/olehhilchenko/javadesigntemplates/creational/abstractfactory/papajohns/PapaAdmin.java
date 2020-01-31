package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.papajohns;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.Administrator;

public class PapaAdmin implements Administrator {
    @Override
    public void manageShift() {
        System.out.println("Admin manages the restaurant shift...");
    }
}
