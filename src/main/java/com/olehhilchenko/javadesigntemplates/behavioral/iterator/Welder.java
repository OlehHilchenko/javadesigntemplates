package main.java.com.olehhilchenko.javadesigntemplates.behavioral.iterator;

public class Welder implements Collection {

    private String name;
    private String [] skill;

    public Welder(String name, String[] skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSkill() {
        return skill;
    }

    public void setSkill(String[] skill) {
        this.skill = skill;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator{

        int index;

        @Override
        public boolean hasNext() {
            if(index < skill.length)
                return true;

            return false;
        }

        @Override
        public Object next() {
            return skill[index++];
        }
    }
}
