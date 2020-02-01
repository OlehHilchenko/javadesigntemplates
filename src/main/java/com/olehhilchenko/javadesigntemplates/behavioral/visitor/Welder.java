package main.java.com.olehhilchenko.javadesigntemplates.behavioral.visitor;

public interface Welder {
    void doIt(Weld weld);

    void doIt(ChopParts chopParts);

    void doIt(ReadTheDrawinds readTheDrawinds);
}
