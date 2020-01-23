package abstractfactory;

import abstractfactory.papajohns.PapaFactory;

public class RunPapaJohns3 {

    public static void main(String[] args) {

        PapaJohnsFactory papaJohnsFactory = new PapaFactory();
        Waiter waiter = papaJohnsFactory.getWaiter();
        Waiter waiter1 = papaJohnsFactory.getWaiter();
        Cook cook = papaJohnsFactory.getCook();
        Cook cook1 = papaJohnsFactory.getCook();
        Administrator administrator = papaJohnsFactory.getAdministrator();
        Administrator administrator1 = papaJohnsFactory.getAdministrator();
        Manager manager = papaJohnsFactory.getManager();

        System.out.println("the restaurant starts to work...");
        cook.toCook();
        cook1.toCook();
        waiter.carryFood();
        waiter1.carryFood();
        administrator.manageShift();
        administrator1.manageShift();
        manager.runARestaurant();
    }
}
