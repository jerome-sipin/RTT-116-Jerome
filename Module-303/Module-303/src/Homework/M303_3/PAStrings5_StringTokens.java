package Homework.M303_3;

import java.util.Arrays;
import java.util.Scanner;

public class PAStrings5_StringTokens {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();

        // Split on all white space characters/spaces and punctuation; and append each token to an array
        String[] result = s.split("[\\s\\p{Punct}]+");

        // Print out the amount of tokens; print the array
        int tokens = result.length;
        System.out.println("Number of tokens: " + tokens);
        System.out.println("Tokens in the string entered:");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }



    }
}
