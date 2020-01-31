package main.java.com.olehhilchenko.javadesigntemplates.creational.builder;

public class JavaDeveloperBuilder extends DeveloperBuilder {

    @Override
    void buildName() {
        developer.setName("Petro");
    }

    @Override
    void buildSkill() {
        developer.setSkill("Java language,  Smart, Fast");
    }

    @Override
    void buildSalary() {
        developer.setSalary(1000);
    }
}
