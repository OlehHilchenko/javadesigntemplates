package main.java.com.olehhilchenko.javadesigntemplates.behavioral.templatemethod;

public class CafeRunner {
    public static void main(String[] args) {
        CafeMenu businessLunchMenu = new BusinessLunchMenu();
        CafeMenu eveningMenus = new EveningMenus();

        businessLunchMenu.menu();

        System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

        eveningMenus.menu();
    }
}
