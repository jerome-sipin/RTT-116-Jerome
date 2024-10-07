package Homework.M303_3_GLab_PracticeAssignments;

import java.util.Scanner;

public class PAStrings4_StringReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();

        // Convert string s into a StringBuffer sb
        StringBuffer sb = new StringBuffer(s);
        // Reverse sb
        StringBuffer sbReverse = new StringBuffer(sb.reverse());

        // convert sbReverse back to a string and compare it to s.
        // if it is the same, s is a palindrome; if not, it is not a palindrome
        boolean palindrome = sbReverse.toString().equals(s);
        if (palindrome == true) {
            System.out.println("This string is a palindrome");
        }
        else {
            System.out.println("This string is NOT a palindrome");
        }
    }
}
