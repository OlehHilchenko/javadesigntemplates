package main.java.com.olehhilchenko.javadesigntemplates.behavioral.observer;

import java.util.List;

public class Participant implements Observer{
    String name;

    public Participant(String name){
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> events) {
        System.out.println("Hi! " + name + "\n We have some changes in events: \n" + events +
        "\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
    }
}
