package main.java.com.olehhilchenko.javadesigntemplates.behavioral.state;

public class Student {

    Action action;

    public void setAction(Action action) {
        this.action = action;
    }

    public void changeAction() {
        if (action instanceof Sleeping)
            setAction(new Working());
        else if (action instanceof Working)
            setAction(new Learning());
        else if (action instanceof Learning)
            setAction(new Training());
        else if (action instanceof Training)
            setAction(new Sleeping());
    }

    public void doIt(){
        action.doIt();
    }
}
