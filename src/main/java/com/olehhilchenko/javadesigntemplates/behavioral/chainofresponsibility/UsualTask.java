package main.java.com.olehhilchenko.javadesigntemplates.behavioral.chainofresponsibility;

public class UsualTask extends PriorityCase{

    public UsualTask(int workPriority) {
        super(workPriority);
    }

    @Override
    public void prioritizeWork(String work) {
        System.out.println("do the job at normal speed: " + work);
    }
}
