package main.java.com.olehhilchenko.javadesigntemplates.creational.builder;

public class Creator {

    DeveloperBuilder developerBuilder;

    public void setDeveloperBuilder(DeveloperBuilder developerBuilder){
        this.developerBuilder = developerBuilder;
    }

    Developer buildDeveloper(){
        developerBuilder.createDeveloper();

        developerBuilder.buildName();
        developerBuilder.buildSkill();
        developerBuilder.buildSalary();

        return developerBuilder.getDeveloper();
    }
}
