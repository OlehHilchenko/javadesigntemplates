package factorymethod;

public class CppTesterFactory implements TesterFactory {

    @Override
    public Tester createTester() {
        return new CppTester();
    }
}
