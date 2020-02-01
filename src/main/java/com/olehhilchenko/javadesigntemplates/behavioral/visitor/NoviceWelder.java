package main.java.com.olehhilchenko.javadesigntemplates.behavioral.visitor;

public class NoviceWelder implements Welder{
    @Override
    public void doIt(Weld weld) {
        System.out.println("Weld dubious welds.");
    }

    @Override
    public void doIt(ChopParts chopParts) {
        System.out.println("Slices curved parts.");
    }

    @Override
    public void doIt(ReadTheDrawinds readTheDrawinds) {
        System.out.println("Reads drawings incorrectly.");
    }
}
