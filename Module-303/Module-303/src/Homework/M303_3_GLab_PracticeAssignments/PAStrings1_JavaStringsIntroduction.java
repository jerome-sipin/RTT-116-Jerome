package Homework.M303_3_GLab_PracticeAssignments;

import java.util.Scanner;

public class PAStrings1_JavaStringsIntroduction {
    public static void main(String[] args) {

        // Java Strings Introduction
        // Perform the following operations -
        // 1. Sum the lengths of strings A and B
        // 2. Determine if A is lexicographically larger than B
        // 3. Capitalize the first letter in A and B and print them on a single line, separated by a space
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = scanner.nextLine();
        System.out.print("Enter another string: ");
        String b = scanner.nextLine();

        // Sum the lengths of a and b
        int aLength, bLength, sum;
        aLength = a.length();
        bLength = b.length();
        sum = aLength + bLength;

        // Determine if a is lexicographically larger than b
        String comparison;
        int compare = a.compareTo(b);
        if (compare > 0){
            comparison = "Yes";
        }
        else {
            comparison = "No";
        }

        // Capitalize the first letter of a and b and print them on a single line, separated by a space
        // get first character of the string and use toUpperCase() on it
        String a1 = a.substring(0,1).toUpperCase();
        String b1 = b.substring(0,1).toUpperCase();
        // replace the first character of each string with its uppercase version sing the replaceFirst() function,
        // which preserves the case of following instances of the first character (e.g., "Tablet" becomes "Tablet",
        // not "TableT"
        a = a.replaceFirst(a.substring(0,1), a1);
        b = b.replaceFirst(b.substring(0,1), b1);
        // combine the strings and put a space between them.
        String c = a + " " + b;

        // print results of these operations to console
        System.out.println("Sum of the lengths of the two strings: " + sum);
        System.out.println("Is A lexicographically greater than B? " + comparison);
        System.out.println("Combination of both strings: " + c);

    }

}
