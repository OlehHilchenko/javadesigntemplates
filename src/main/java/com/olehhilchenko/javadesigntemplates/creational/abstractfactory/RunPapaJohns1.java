package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.papajohns.PapaFactory;

public class RunPapaJohns1 {

    public static void main(String[] args) {
        PapaJohnsFactory papaJohnsFactory = new PapaFactory();

        Waiter waiter = papaJohnsFactory.getWaiter();
        Cook cook = papaJohnsFactory.getCook();
        Administrator administrator = papaJohnsFactory.getAdministrator();
        Manager manager = papaJohnsFactory.getManager();

        System.out.println("the restaurant starts to work...");
        cook.toCook();
        waiter.carryFood();
        administrator.manageShift();
        manager.runARestaurant();
    }
}
