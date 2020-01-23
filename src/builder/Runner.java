package builder;

public class Runner {
    public static void main(String[] args) {
        Creator creator = new Creator();

        creator.setDeveloperBuilder(new JavaDeveloperBuilder());
        Developer developer = creator.buildDeveloper();


        System.out.println(developer);
    }
}
