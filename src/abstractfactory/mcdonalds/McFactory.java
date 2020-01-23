package abstractfactory.mcdonalds;

import abstractfactory.*;

public class McFactory implements McTeamFactory {

    @Override
    public Cashier getCashier() {
        return new McCashier();
    }

    @Override
    public Cook getCook() {
        return new McCook();
    }

    @Override
    public Administrator getAdministrator() {
        return new McAdmin();
    }

    @Override
    public Manager getManager() {
        return new McManager();
    }
}
