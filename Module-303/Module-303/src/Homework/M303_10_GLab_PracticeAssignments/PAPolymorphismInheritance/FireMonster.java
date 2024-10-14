package Homework.M303_10_GLab_PracticeAssignments.PAPolymorphismInheritance;

public class FireMonster extends Monster {
    public FireMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
       return "Attack with fire!";
    }
}
