package main.java.com.olehhilchenko.javadesigntemplates.behavioral.Interpreter;

public class OrExp implements Expression{
    private Expression expression1;
    private Expression expression2;

    public OrExp(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpret(String text) {
        return expression1.interpret(text) || expression2.interpret(text);
    }
}
