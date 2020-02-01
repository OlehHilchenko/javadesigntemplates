package main.java.com.olehhilchenko.javadesigntemplates.behavioral.strategy;

public class Student {
    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void executeAction(){
        action.doIt();
    }
}
