package Homework.M303_5_GLab_PracticeAssignments;

import java.util.Scanner;

public class GLabForLoop {
    public static void main(String[] args) {

        // Example 1 - display a text five times
        // print a text 5 times
        int n = 5;
        // for loop
        for ( int i = 1; i <= n; i++ ){
            System.out.println(i + " Java is fun");
        }
        System.out.println("Example 1 completed");

        // Example 2 - display sum of n natural numbers
        // Find the sum of natural numbers frmo 1 to 1000
        int sum = 0;
        n = 1000;
        // for loop
        for ( int i = 1; i <= n; i++ ){
            // body inside for loop
            sum = sum + i; // the guided lab uses sum += i, which is functionally the same thing
        }
        System.out.println("Sum = " + sum);
        System.out.println("Example 2 completed");

        // Example 3 - palindrome
        String original, reverse = ""; // String objects
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        if (original.equals(reverse)){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("It is not a palindrome");
        }
        System.out.println("Example 3 completed");

        // Example 4 - pyramid
        for ( int i = 1;  i <= 5 ; i++ ){
            for ( int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println(); // new line
        }
       System.out.println("Example 4 completed");

    }
}
