package Classwork_InClassExamples.perscholas;

public class Lesson303dot2 {

    public static void main(String[] args) {

        System.out.print("This is line 1\n");
        System.out.print("This is line 2");

        // System.out.println - automatically includes a new line for you
        // This another memorize thing in that print does include a new line

        System.out.println("This is line 3");
        System.out.println("This is line 4");

        // if we want to express a tab in a string
        System.out.println("This is a tab -> \t <-");
        // A tab is a single character that represents multiple spaces

        // we are going to use a \ to escape the " so that Java thinks that it is actually the character
        // and not the end of the string
        System.out.println("What happens if we want to have a \" in the string itself?");

        // because the \ is the escape character, it too needs to be escaped
        System.out.println("We want to print out the \\ backslash character");

        // this is a string literal, meaning that  a new string object is created and set
        // to "abc"
        String x = "abc";

        // print in upper case
        System.out.println(x.toUpperCase());

        // in contrast to a primitive type, there are no functions in a primitive data type
        // try doing "x." compared to "a." - see how many different methods pop up
        // for the String, but not the int.
        int a = 5;


    }

}
