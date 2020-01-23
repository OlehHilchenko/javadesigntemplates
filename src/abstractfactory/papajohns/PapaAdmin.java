package abstractfactory.papajohns;

import abstractfactory.Administrator;

public class PapaAdmin implements Administrator {
    @Override
    public void manageShift() {
        System.out.println("Admin manages the restaurant shift...");
    }
}
