package main.java.com.olehhilchenko.javadesigntemplates.behavioral.memento;

import java.util.Date;

public class Drawing {
    private String version;
    private Date date;

    public void setVersionAndDate(String version){
        this.version = version;
        this.date = new Date();
    }

    public Archive archive(){
        return new Archive(version);
    }

    public void extract(Archive archive){
        this.version = archive.getVersion();
        this.date = archive.getData();
    }

    @Override
    public String toString() {
        return "Drawing:\n" +
                "version = '" + version + '\'' +
                " , date = " + date;
    }
}
