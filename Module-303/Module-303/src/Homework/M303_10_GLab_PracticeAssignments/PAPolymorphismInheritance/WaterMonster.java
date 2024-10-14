package Homework.M303_10_GLab_PracticeAssignments.PAPolymorphismInheritance;

public class WaterMonster extends Monster {

    public WaterMonster(String name) {
        super(name);
    }

    @Override
    public String attack(){
        return "Attack with water!";
    }

}
