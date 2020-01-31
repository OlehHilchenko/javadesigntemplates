package main.java.com.olehhilchenko.javadesigntemplates.behavioral.command;

public class UpdateCommand implements Command{

    Store store;

    public UpdateCommand(Store store) {
        this.store = store;
    }

    @Override
    public void perform() {
        store.updateFile();
    }
}
