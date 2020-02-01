package main.java.com.olehhilchenko.javadesigntemplates.behavioral.visitor;

public class ProductRunner {
    public static void main(String[] args) {
        Product product = new Product();

        Welder novice = new NoviceWelder();
        Welder experienced = new ExperiencedWelder();

        System.out.println("Novice in action...");
        product.beDone(novice);

        System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        System.out.println("Experienced in action...");
        product.beDone(experienced);
    }
}
