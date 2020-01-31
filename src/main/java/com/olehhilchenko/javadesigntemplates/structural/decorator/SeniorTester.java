package main.java.com.olehhilchenko.javadesigntemplates.structural.decorator;

public class SeniorTester extends TesterDecorator {

    public SeniorTester(Tester tester) {
        super(tester);
    }

    public String writeComplexTests(){
        return " Write complex test.";
    }

    @Override
    public String toDoWork() {
        return super.toDoWork() + writeComplexTests();
    }
}
