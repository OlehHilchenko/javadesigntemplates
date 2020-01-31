package main.java.com.olehhilchenko.javadesigntemplates.creational.factorymethod;

public class JavaTesterFactory implements TesterFactory {

    @Override
    public Tester createTester() {
        return new JavaTester();
    }
}
