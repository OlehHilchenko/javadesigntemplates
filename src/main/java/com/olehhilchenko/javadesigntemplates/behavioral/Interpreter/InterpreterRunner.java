package main.java.com.olehhilchenko.javadesigntemplates.behavioral.Interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isMMA = getMMAWelderExp();
        Expression isTIG = getTIGWelderExp();

        System.out.println("Does welder knows MMA welding: " + isMMA.interpret("MMA Welder"));
        System.out.println("Does welder knows TIG welding: " + isTIG.interpret("TIG Welder"));
    }

    public static Expression getMMAWelderExp(){
        Expression MMAWelder = new TerminalExp("MMA Welder");
        Expression Welder = new TerminalExp("Welder");

        return new OrExp(MMAWelder, Welder);
    }

    public static Expression getTIGWelderExp(){
        Expression TIGWelder = new TerminalExp("TIG Welder");
        Expression Welder = new TerminalExp("Welder");

        return new AndExp(TIGWelder, Welder);
    }
}
