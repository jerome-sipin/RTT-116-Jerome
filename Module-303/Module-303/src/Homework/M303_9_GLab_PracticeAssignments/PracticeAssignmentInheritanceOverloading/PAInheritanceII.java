package Homework.M303_9_GLab_PracticeAssignments.PracticeAssignmentInheritanceOverloading;
import java.io.*;
import java.util.*;

class Arithmetic{

    public int add(int a, int b){
        return a + b;
    }
}

class Adder extends Arithmetic{

}
public class PAInheritanceII {
    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());
        int x = a.add(10, 32);
        int y = a.add(10, 3);
        int z = a.add(10, 10);
        System.out.println(x + " " + y + " " + z);
    }
}
