package Classwork_InClassExamples.M303_5;

public class StringNullsExample {
    public static void main(String[] args) {

        // !!!!!!!!!!! null is not equal to an empty string!!!



        // null is its own built-in part of java
        // no memory has been allocated and this is simply a variable that has no value;
        // --- Important !!!! ---
        String s = null; // this string does not exist at all.
        String s1 = ""; // this string exists as an object in memory and we can call functions on it

        System.out.println("The length of s1 = " + s.length());
        // note that I can still call functions on s1 because it is a real object
        s1.trim();
        s1.toUpperCase();

        // we can check if s exists by saying s == null
        if (s == null){
            System.out.println("the variable s does not exist");
        }

        // NullPointerException
        //s.length();

        // check for an empty string
        if ( s == null || s.length() == 0 ){
            // the string is empty
            System.out.println("The string is empty");
        }

        // doing comparisons ... in Jaa can never compare strings this way... it will always produce the wrong result
        // however, it might fool you sometimes
        if ( s == s1 ){
            // this is always wrong
        }

        // this is the correct way of doing string comparison
        // the problem we have... is that s is null in our case here (refer to string token hackerrank)
        if ( s != null && s.equals(s1) ){
            //then the 2 strings are equal in a safe way
        }

        // for the cde we have here... we could simply check
        // in this simple case we know s is null so this if statement will work
        // in real life you may not know this 100% for sure, so we have to do the null check like above
        if ( s1.equals(s) ){
            System.out.println("Will never print because null is not equal to empty string");
        }
        else{
            System.out.println("null is not equal to an empty string");
        }

    }
}
