package Homework.M303_9_GLab_PracticeAssignments.PracticeAssignmentInheritanceOverloading;
class Cycle{
    void print(){
        System.out.println( "My ancestor is a cycle who is a vehicle with pedals." );
    }
}

class Motorcycle extends Cycle{
    void print(){
        System.out.println( "Hello I am a motorcycle, I am a cycle with an engine." );
        super.print();
    }
}
public class PAMethodOverridingII {
    public static void main(String[] args) {
        Motorcycle a = new Motorcycle();
        a.print();
    }
}
