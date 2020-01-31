package main.java.com.olehhilchenko.javadesigntemplates.behavioral.command;

public class Worker {

    Command create;
    Command update;
    Command view;
    Command delete;

    public Worker(Command create, Command update, Command view, Command delete) {
        this.create = create;
        this.update = update;
        this.view = view;
        this.delete = delete;
    }

    public void createFile(){
        create.perform();
    }

    public void updateFile(){
        update.perform();
    }

    public void viewFile(){
        view.perform();
    }

    public void deleteFile(){
        delete.perform();
    }
}
