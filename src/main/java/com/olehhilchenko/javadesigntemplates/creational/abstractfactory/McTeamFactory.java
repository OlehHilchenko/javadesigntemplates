package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory;

public interface McTeamFactory {

    Cashier getCashier();

    Cook getCook();

    Administrator getAdministrator();

    Manager getManager();
}
