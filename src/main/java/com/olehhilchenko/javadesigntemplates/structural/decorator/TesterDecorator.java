package main.java.com.olehhilchenko.javadesigntemplates.structural.decorator;

public class TesterDecorator implements Tester {

    Tester tester;

    public TesterDecorator(Tester tester) {
        this.tester = tester;
    }

    @Override
    public String toDoWork() {
        return tester.toDoWork();
    }
}
