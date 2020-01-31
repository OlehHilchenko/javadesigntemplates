package main.java.com.olehhilchenko.javadesigntemplates.behavioral.chainofresponsibility;

public class WorkRunner {

    public static void main(String[] args) {
        PriorityCase usualCase = new UsualTask(Priority.DO_WORK);
        PriorityCase urgentCase = new UrgentTask(Priority.DO_WORK_FAST);
        PriorityCase burningCase = new BurningBuilding(Priority.DO_WORK_EXTRA_FAST);

        usualCase.setNextPriorityCase(urgentCase);
        urgentCase.setNextPriorityCase(burningCase);

        usualCase.casePriorityManager("do everyday work " , Priority.DO_WORK);
        usualCase.casePriorityManager("forgotten work ", Priority.DO_WORK_FAST);
        usualCase.casePriorityManager("work what needs to be done the day before yesterday ", Priority.DO_WORK_EXTRA_FAST);
    }
}
