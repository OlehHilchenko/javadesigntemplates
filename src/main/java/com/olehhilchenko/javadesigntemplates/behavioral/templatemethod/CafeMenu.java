package main.java.com.olehhilchenko.javadesigntemplates.behavioral.templatemethod;

public abstract class CafeMenu {

    public void menu(){
        System.out.println("Beverages");
        mainMenu();
        System.out.println("Dessert");
    }

    public abstract void mainMenu();
}
