package Homework.M303_3;

import java.util.Scanner;

public class PAStrings2_Substring {
    public static void main(String[] args) {

        // Given a string s and two indices, start and end, print a substring consisting of all
        // characters in the inclusive range from start to end - 1. You'll find the String class'
        // substring method helpful in completing this challenge.

        // Create scanner, ask for string and start/end indices
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        System.out.print("Enter starting index: ");
        int start = scanner.nextInt();
        System.out.print("Enter ending index: ");
        int end = scanner.nextInt();

        // Create substring from user's inputs
        String sSubstring = s.substring(start, end);

        // Print created substring to console
        System.out.println(sSubstring);

    }
}
