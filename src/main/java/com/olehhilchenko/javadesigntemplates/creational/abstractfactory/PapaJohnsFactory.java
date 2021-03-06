package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory;

public interface PapaJohnsFactory {

    Waiter getWaiter();

    Cook getCook();

    Administrator getAdministrator();

    Manager getManager();
}
