package main.java.com.olehhilchenko.javadesigntemplates.behavioral.chainofresponsibility;

public abstract class PriorityCase {

    private int workPriority;
    private PriorityCase nextPriorityCase;

    public PriorityCase(int workPriority) {
        this.workPriority = workPriority;
    }

    public void setNextPriorityCase(PriorityCase nextPriorityCase) {
        this.nextPriorityCase = nextPriorityCase;
    }

    public void casePriorityManager(String work, int priority) {

        if (priority >= workPriority)
            prioritizeWork(work);
        if (nextPriorityCase != null)
            nextPriorityCase.casePriorityManager(work, priority);
    }

    public abstract void prioritizeWork(String work);
}
