package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.papajohns;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.Waiter;

public class PapaWaiter implements Waiter {
    @Override
    public void carryFood() {
        System.out.println("Waiter serves pizzeria customers...");
    }
}
