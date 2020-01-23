package factorymethod;

public class JavaTesterFactory implements TesterFactory {

    @Override
    public Tester createTester() {
        return new JavaTester();
    }
}
