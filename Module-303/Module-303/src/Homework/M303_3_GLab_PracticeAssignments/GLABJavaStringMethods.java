package Homework.M303_3_GLab_PracticeAssignments;

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
        r1 = s1.indexOf('s');
        System.out.println(r1); // 6
        // getting index of character 'J'
        r1 = s1.lastIndexOf('J');
        System.out.println(r1); // 0
        // when a string has multiple occurrences of a letter, the last is returned
        r1 = s1.lastIndexOf('a');
        System.out.println(r1); // 3
        // what happens when a character is no in the string?
        r1 = s1.lastIndexOf('j');
        System.out.println(r1); // -1
        // getting the last occurrence of "ava"
        r1 = s1.lastIndexOf("ava");
        System.out.println(r1); // 1
        // substring not in the string
        r1 = s1.lastIndexOf("java");
        System.out.println(r1); // -1

        // contains() methood
        s1 = "Learn Java";
        Boolean r;
        // check if s1 contains "Java";
        r = s1.contains("Java");
        System.out.println(r); // true
        // check if s1 contains "Python"
        r = s1.contains("Python");
        System.out.println(r); // false
        // check if s1 contains ""
        r = s1.contains("");
        System.out.println(r); // true

        // replace() method
        s1 = "abc cba";

        // all occurrences of 'a' is replaced with 'z'
        System.out.println(s1.replace('a', 'z'));
        // all occurrences of 'L' is replaced with 'J'
        System.out.println(s1.replace('L', 'J'));
        // character not in the string
        System.out.println("Hello".replace('4', 'J'));
        // all occurrences of "C++" is replaced with "Java"
        System.out.println(s1.replace("C++", "Java"));
        // all occurrences of "aa" is replaced with "zz"
        System.out.println("aa bb aa zz".replace("aa", "zz"));
        // substring not in the string
        System.out.println("Java".replace("C++", "C"));

        // replaceAll() method
        s1 = "Java123is456fun";
        // regex for sequence of digits
        // note the definition of a regex - a string that is to be replaced.
        // further note, the syntax for this method is string.replaceAll(String regex, String replacement)
        String regex = "\\d+";
        // replace all occurrences of numeric digits with a space
        System.out.println(s1.replaceAll(regex, " "));

        // comparison of strings using the equals() method
        s1 = "PerScholas";
        s2 = "PerScholas";
        String s10 = new String ("PerScholas");
        s4 = "Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s10));//true
        System.out.println(s1.equals(s4));//false

        // comparison of strings using the == operator
        // using the same strings that were defined in the previous section
        System.out.println(s1==s2); // true, because both refer to the same instance
        System.out.println(s1==s10);// false, because s10 refers to an instance created in nonpool

        // comparison of string using the compareTo() method
        s1 = "Perscholas";
        s2 = "Perscholas";
        s3 = "Perschola";
        s4 = "PerscholasX";
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareTo(s3)); // 1(because s1>s3)
        System.out.println(s1.compareTo(s4)); // -1(because s1<s4 )

    }
}
