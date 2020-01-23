package abstractfactory.mcdonalds;

import abstractfactory.Manager;

public class McManager implements Manager {
    @Override
    public void runARestaurant() {
        System.out.println("Manager runs a restaurant...");
    }
}
