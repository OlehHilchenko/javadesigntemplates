package abstractfactory;

public interface PapaJohnsFactory {

    Waiter getWaiter();

    Cook getCook();

    Administrator getAdministrator();

    Manager getManager();
}
