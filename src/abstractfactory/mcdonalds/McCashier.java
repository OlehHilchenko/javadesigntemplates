package abstractfactory.mcdonalds;

import abstractfactory.Cashier;

public class McCashier implements Cashier {
    @Override
    public void countCustomer() {
        System.out.println("Cashier count mcdonalds clients...");
    }
}
