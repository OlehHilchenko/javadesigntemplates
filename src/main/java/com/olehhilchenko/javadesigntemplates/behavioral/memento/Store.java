package main.java.com.olehhilchenko.javadesigntemplates.behavioral.memento;

public class Store {
    private Archive archive;

    public Archive getArchive() {
        return archive;
    }

    public void setArchive(Archive archive) {
        this.archive = archive;
    }
}
