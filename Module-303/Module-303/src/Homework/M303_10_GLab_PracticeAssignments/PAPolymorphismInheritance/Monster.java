package Homework.M303_10_GLab_PracticeAssignments.PAPolymorphismInheritance;

public class Monster {

    private String name;

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String attack(){
        return "!^_&^$@+%$* I don't know how to attack!";
    }

}
