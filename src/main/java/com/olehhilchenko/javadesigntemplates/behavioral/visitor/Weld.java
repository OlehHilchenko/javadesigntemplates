package main.java.com.olehhilchenko.javadesigntemplates.behavioral.visitor;

public class Weld implements ProductElement{
    @Override
    public void beDone(Welder welder) {
        welder.doIt(this);
    }
}
