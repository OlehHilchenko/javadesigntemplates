package main.java.com.olehhilchenko.javadesigntemplates.behavioral.chainofresponsibility;

public class BurningBuilding extends PriorityCase {

    public BurningBuilding(int workPriority) {
        super(workPriority);
    }

    @Override
    public void prioritizeWork(String work) {
        System.out.println("do everything very very fast: " + work);
    }
}
