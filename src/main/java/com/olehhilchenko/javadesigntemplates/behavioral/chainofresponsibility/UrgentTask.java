package main.java.com.olehhilchenko.javadesigntemplates.behavioral.chainofresponsibility;

public class UrgentTask extends PriorityCase {

    public UrgentTask(int workPriority) {
        super(workPriority);
    }

    @Override
    public void prioritizeWork(String work) {
        System.out.println("hurry up: " + work);
    }
}
