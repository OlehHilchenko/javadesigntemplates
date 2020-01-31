package main.java.com.olehhilchenko.javadesigntemplates.behavioral.command;

public class CreateCommand implements Command {

    Store store;

    public CreateCommand(Store store) {
        this.store = store;
    }

    @Override
    public void perform() {
        store.createFile();
    }
}
