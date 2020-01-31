package main.java.com.olehhilchenko.javadesigntemplates.behavioral.memento;

import java.util.Date;

public class Archive {

    private final String version;
    private final Date data;

    public Archive(String version){
        this.version = version;
        this.data = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getData() {
        return data;
    }
}
