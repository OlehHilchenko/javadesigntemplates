package main.java.com.olehhilchenko.javadesigntemplates.behavioral.iterator;

public class WelderRunner {
    public static void main(String[] args) {
        String [] skills = {"MMA Welding", "MIG/MAG Welding", "TIG Welding", "Gas cutter"};

        Welder welder = new Welder("Oleg Gilchenko", skills);

        Iterator iterator = welder.getIterator();
        System.out.println("Weder: " + welder.getName());
        System.out.println("Skills: ");

        while (iterator.hasNext())
            System.out.print(iterator.next().toString() + ", ");
    }
}
