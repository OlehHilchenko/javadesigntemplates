package abstractfactory.papajohns;

import abstractfactory.*;

public class PapaFactory implements PapaJohnsFactory {

    @Override
    public Cook getCook() {
        return new PapaCook();
    }

    @Override
    public Waiter getWaiter() {
        return new PapaWaiter();
    }

    @Override
    public Administrator getAdministrator() {
        return new PapaAdmin();
    }

    @Override
    public Manager getManager() {
        return new PapaManager();
    }
}
