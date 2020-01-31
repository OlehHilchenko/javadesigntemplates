package main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.mcdonalds;

import main.java.com.olehhilchenko.javadesigntemplates.creational.abstractfactory.*;

public class McFactory implements McTeamFactory {

    @Override
    public Cashier getCashier() {
        return new McCashier();
    }

    @Override
    public Cook getCook() {
        return new McCook();
    }

    @Override
    public Administrator getAdministrator() {
        return new McAdmin();
    }

    @Override
    public Manager getManager() {
        return new McManager();
    }
}
