package abstractfactory;

public interface McTeamFactory {

    Cashier getCashier();

    Cook getCook();

    Administrator getAdministrator();

    Manager getManager();
}
