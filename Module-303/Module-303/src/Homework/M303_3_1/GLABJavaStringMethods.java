package Homework.M303_3_1;

import java.util.Arrays;

public class GLABJavaStringMethods {
    public static void main(String[] args) {

        // length() method
        String s1 = "Java";
        String s2 = "";

        System.out.println(s1.length()); // 4
        System.out.println(s2.length()); // 0
        System.out.println("Java".length()); // 4
        System.out.println("Java\n".length()); // 5
        System.out.println("Learn Java".length()); // 10

        // isEmpty() method
        s1 = "";
        s2 = "hello";
        System.out.println(s1.isEmpty()); // true
        System.out.println(s2.isEmpty()); // false

        // trim() method
        s1 = "  hello    ";
        System.out.println(s1 + "how are you");
        System.out.println(s1.trim() + " how are you");

        // toLowerCase() method
        s1 = "HELLO HOW Are You?";
        String s1L = s1.toLowerCase();
        System.out.println(s1L);

        // toUpper() method
        s1 = "hello how are you";
        String s1U = s1.toUpperCase();
        System.out.println(s1U);

        // concat() method
        s1 = "Learn ";
        s2 = "Java";
        // using the concat() method
        System.out.println(s1.concat(s2)); // "Learn Java"
        System.out.println(s2.concat(s1)); // "JavaLearn "
        // using the + operator
        String s3 = "hello";
        String s4 = "Learners";
        String s5 = s3 + s4; // equivalent to s3.concat(s4)
        System.out.println(s5); // "helloLearners"
        // Concatenated three strings
        String message = "Welcome " + "to " + " Java";
        System.out.println(message); // "Welcome to Java"
        // String Chapter is concatenated with the number 2
        String s = "Chapter" + 2; // "Chapter2"
        System.out.println(s);
        // String Supplement is concatenated with the character B
        s1 = "Supplement" + 'B'; // "SupplementB"
        System.out.println(s1);

        // split() method
        String vowels = "a::b::c::d::e";
        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");
        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        // charAt() method
        message = "Welcome to Java";
        System.out.println("The first character in the message is " + message.charAt(0));

        // compareTo() method
        s1 = "hello";
        s2 = "hello";
        s3 = "hemlo";
        s4 = "flag";
        System.out.println(s1.compareTo(s2)); // 0 because both are equal
        System.out.println(s1.compareTo(s3)); // -1 because "l" is only one time lower than "m"
        System.out.println(s1.compareTo(s4)); // 2 because "h" is 2 times greater than "f"

        // substring() method
        s1 = "java is fun";
        // extract substring from index 0 to 3
        System.out.println(s1.substring(0, 4));

        // indexOf() method
        s1 = "Java is fun";
        int r1;
        // getting index of character 's'
       





    }
}
