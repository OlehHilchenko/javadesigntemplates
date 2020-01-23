package builder;

public class CppDeveloperBuilder extends DeveloperBuilder{

    @Override
    void buildName() {
        developer.setName("Oleg");
    }

    @Override
    void buildSkill() {
        developer.setSkill("C++ language");
    }

    @Override
    void buildSalary() {
        developer.setSalary(500);
    }
}
