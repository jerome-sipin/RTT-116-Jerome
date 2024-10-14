package Homework.M303_10_GLab_PracticeAssignments.PAPolymorphismInheritance;

public class StoneMonster extends Monster {

    public StoneMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Attack with fire!";
    }
}
