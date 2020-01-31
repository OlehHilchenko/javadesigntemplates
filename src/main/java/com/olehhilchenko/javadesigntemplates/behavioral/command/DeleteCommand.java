package main.java.com.olehhilchenko.javadesigntemplates.behavioral.command;

public class DeleteCommand implements Command{

    Store store;

    public DeleteCommand(Store store) {
        this.store = store;
    }

    @Override
    public void perform() {
        store.deleteFile();
    }
}
