package factorymethod;

public class JsTesterFactory implements TesterFactory {

    @Override
    public Tester createTester() {
        return new JsTester();
    }
}
