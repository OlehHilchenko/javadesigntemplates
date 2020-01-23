package abstractfactory;

import abstractfactory.mcdonalds.McFactory;

public class RunMcDonaldsNum12 {

    public static void main(String[] args) {

        McTeamFactory mcTeamFactory = new McFactory();
        Cashier cashier = mcTeamFactory.getCashier();
        Cook cook = mcTeamFactory.getCook();
        Administrator administrator = mcTeamFactory.getAdministrator();
        Manager manager = mcTeamFactory.getManager();

        System.out.println("the restaurant starts to work");
        cook.toCook();
        cashier.countCustomer();
        administrator.manageShift();
        manager.runARestaurant();
    }
}
