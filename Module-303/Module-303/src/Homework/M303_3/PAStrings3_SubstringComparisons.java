package Homework.M303_3;

import java.util.Scanner;

public class PAStrings3_SubstringComparisons {
    public static void main(String[] args) {

        String smallest = "";
        String largest = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter substring length: ");
        int x = scanner.nextInt();

        // Set smallest/largest to first substring in selected word
        smallest = s1.substring(0, x);
        largest = s1.substring(0, x);

        // For loop through the word. Take substrings of length x, starting at whatever character we are at, and ending
        // at x + 1 characters before the word ends. For example, in hackerrank, "welcometojava" is split into
        // wel
        // elc
        // lco
        // com
        // ome
        // met
        // eto
        // toj
        // oja
        // jav
        // ava
        // welcometojava
        // 0123456789012
        int y = (s1.length() - x) + 1; // ends search for substrings x + 1 indices before the word ends.
        String comparedString; // the string we will be comparing this iteration of the loop
        int cValueS; // compareTo smallest
        int cValueL; // compareTo largest
        for (int i = 0; i < y; i++) {
            comparedString = s1.substring(i, i + x);
            cValueS = comparedString.compareTo(smallest);
            cValueL = comparedString.compareTo(largest);
            if (cValueS < 0) {
                smallest = comparedString;
            }
            else if (cValueL > 0) {
                largest = comparedString;
            }
        }
        // return smallest/largest
        System.out.println("Smallest string: " + smallest);
        System.out.println("Largest string: " + largest);

    }
}
