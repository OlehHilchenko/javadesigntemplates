package factorymethod;


import java.util.Scanner;

public class Runner {


    static TesterFactory createTesterFactory(String testerSpec) {
        if (testerSpec.equals("java"))
            return new JavaTesterFactory();
        else if (testerSpec.equals("Cpp"))
            return new CppTesterFactory();
        else if (testerSpec.equals("Php"))
            return new PhpTesterFactory();
        else if (testerSpec.equals("Js"))
            return new JsTesterFactory();
        else
            throw new RuntimeException(testerSpec + "is unknown spec...");

    }

    static String scanner (){
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {


        TesterFactory testerFactory = createTesterFactory(scanner());
        Tester tester = testerFactory.createTester();

        tester.testingCode();
    }
}
