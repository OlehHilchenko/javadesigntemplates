package main.java.com.olehhilchenko.javadesigntemplates.behavioral.command;

public class StoreRunner {

    public static void main(String[] args) {
        Store store = new Store();

        Worker worker = new Worker(
                new CreateCommand(store),
                new UpdateCommand(store),
                new ViewCommand(store),
                new DeleteCommand(store)
        );

        worker.createFile();
        worker.updateFile();
        worker.viewFile();
        worker.deleteFile();
    }
}
