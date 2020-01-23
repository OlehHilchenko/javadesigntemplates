package factorymethod;

public class PhpTesterFactory implements TesterFactory {

    @Override
    public Tester createTester() {
        return new PhpTester();
    }
}
