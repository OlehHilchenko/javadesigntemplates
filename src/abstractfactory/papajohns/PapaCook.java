package abstractfactory.papajohns;

import abstractfactory.Cook;

public class PapaCook implements Cook {
    @Override
    public void toCook() {
        System.out.println("Cook preparing pizza papa john...");
    }
}
