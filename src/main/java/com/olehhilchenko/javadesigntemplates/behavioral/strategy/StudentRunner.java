package main.java.com.olehhilchenko.javadesigntemplates.behavioral.strategy;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();

        student.setAction(new Sleeping());
        student.executeAction();

        student.setAction(new Working());
        student.executeAction();

        student.setAction(new Learning());
        student.executeAction();

        student.setAction(new Training());
        student.executeAction();

        student.setAction(new Sleeping());
        student.executeAction();
    }
}
