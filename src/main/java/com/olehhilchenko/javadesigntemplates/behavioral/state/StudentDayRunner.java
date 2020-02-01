package main.java.com.olehhilchenko.javadesigntemplates.behavioral.state;

public class StudentDayRunner {
    public static void main(String[] args) {
        Action action = new Sleeping();
        Student student = new Student();

        student.setAction(action);

        for (int i = 0; i < 9; i++){
            student.doIt();
            student.changeAction();
        }
    }
}
