package main.java.com.olehhilchenko.javadesigntemplates.creational.factorymethod;

public class CppTesterFactory implements TesterFactory {

    @Override
    public Tester createTester() {
        return new CppTester();
    }
}
