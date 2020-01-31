package main.java.com.olehhilchenko.javadesigntemplates.behavioral.observer;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> events);
}
