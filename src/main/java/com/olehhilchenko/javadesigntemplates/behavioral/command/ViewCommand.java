package main.java.com.olehhilchenko.javadesigntemplates.behavioral.command;

public class ViewCommand implements Command {

    Store store;

    public ViewCommand(Store store) {
        this.store = store;
    }

    @Override
    public void perform() {
        store.viewFile();
    }
}
