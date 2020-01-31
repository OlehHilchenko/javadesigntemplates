package main.java.com.olehhilchenko.javadesigntemplates.creational.factorymethod;

public class PhpTesterFactory implements TesterFactory {

    @Override
    public Tester createTester() {
        return new PhpTester();
    }
}
