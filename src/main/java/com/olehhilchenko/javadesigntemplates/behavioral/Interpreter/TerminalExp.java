package main.java.com.olehhilchenko.javadesigntemplates.behavioral.Interpreter;

public class TerminalExp implements Expression{
    private String data;

    public TerminalExp(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String text) {
        if (text.contains(data))
            return true;

        return false;
    }
}
