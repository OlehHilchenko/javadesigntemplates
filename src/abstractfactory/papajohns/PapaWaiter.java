package abstractfactory.papajohns;

import abstractfactory.Waiter;

public class PapaWaiter implements Waiter {
    @Override
    public void carryFood() {
        System.out.println("Waiter serves pizzeria customers...");
    }
}
