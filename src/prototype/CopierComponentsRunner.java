package prototype;

public class CopierComponentsRunner {

    public static void main(String[] args) {

        Component prototype = new Component("Steel", 44, 22, 12);
        System.out.println(prototype);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        ComponentFactory componentFactory = new ComponentFactory(prototype);
        Component firstCopy = componentFactory.cloneComponent();
        System.out.println(firstCopy);
    }
}
