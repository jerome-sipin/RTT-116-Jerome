package Classwork_InClassExamples.perscholas;

public class WrapperClassesExample {

    public static void autobox(Integer x){
        System.out.println("function called with "  + x);
    }

    public static void booleanAutoBox(boolean b){
        System.out.println("function called with "  + b);
    }

    public static void main(String[] args) {

        int x = 5;

        // this is autoboxing. The compiler / JVM sees this is a primitive
        // and will auto convert it into an integer
        Integer y = x;

        // this is manually converting a primitive int into a wrapper class
        Integer z  = Integer.valueOf(x);

        // call the function
        autobox(5);
        autobox(x);
        autobox(z);

        // all Java objects can be null.
        Integer value = null;

        // a primitive cannot be null
        // int v1 = null;

        // Note that wrapper classes (such as Integer) are objects

        Boolean b1 = true;
        boolean b2 = false;

        booleanAutoBox(b1);
        booleanAutoBox(b2);

        // A string uses quote marks "
        String s1 =  "string 1";

        // A character uses a single quote mark '
        Character c = 'c';

    }
}
