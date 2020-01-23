package builder;

public abstract class DeveloperBuilder {

    Developer developer;

    void createDeveloper(){
        developer = new Developer();
    }

    abstract void buildName();
    abstract void buildSkill();
    abstract void buildSalary();

    Developer getDeveloper(){
        return developer;
    }
}
