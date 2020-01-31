package main.java.com.olehhilchenko.javadesigntemplates.creational.builder;

public class Developer {
    String name;
    String skill;
    int salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", skill='" + skill + '\'' +
                ", salary=" + salary +
                '}';
    }
}
