package abstractfactory.mcdonalds;

import abstractfactory.Cook;

public class McCook implements Cook {
    @Override
    public void toCook() {
        System.out.println("Cook, cook mcdonalds menu...");
    }
}
