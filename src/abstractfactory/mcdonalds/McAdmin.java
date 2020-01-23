package abstractfactory.mcdonalds;

import abstractfactory.Administrator;

public class McAdmin implements Administrator {
    @Override
    public void manageShift() {
        System.out.println("Admin manages the restaurant shift...");    }
}
