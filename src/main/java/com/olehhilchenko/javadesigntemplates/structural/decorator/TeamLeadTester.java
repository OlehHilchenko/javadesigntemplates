package main.java.com.olehhilchenko.javadesigntemplates.structural.decorator;

public class TeamLeadTester extends TesterDecorator {

    public TeamLeadTester(Tester tester) {
        super(tester);
    }

    public String teamWork(){
        return " Keep an eye on team work.";
    }

    @Override
    public String toDoWork() {
        return super.toDoWork() + teamWork();
    }
}
