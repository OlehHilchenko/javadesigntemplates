package main.java.com.olehhilchenko.javadesigntemplates.structural.decorator;

public class WorkRunner {

    public static void main(String[] args) {

        Tester tester = new TeamLeadTester(new SeniorTester(new JuniorTester()));

        System.out.println(tester.toDoWork());
    }
}
