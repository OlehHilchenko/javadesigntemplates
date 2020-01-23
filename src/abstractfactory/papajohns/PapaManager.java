package abstractfactory.papajohns;

import abstractfactory.Manager;

public class PapaManager implements Manager {

    @Override
    public void runARestaurant() {
        System.out.println("Manager runs a restaurant...");
    }
}
