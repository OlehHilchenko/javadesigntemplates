package main.java.com.olehhilchenko.javadesigntemplates.behavioral.visitor;

public class ExperiencedWelder implements Welder{
    @Override
    public void doIt(Weld weld) {
        System.out.println("Makes quality welds.");
    }

    @Override
    public void doIt(ChopParts chopParts) {
        System.out.println("Cuts even parts.");
    }

    @Override
    public void doIt(ReadTheDrawinds readTheDrawinds) {
        System.out.println("Reads blueprints competently.");
    }
}
