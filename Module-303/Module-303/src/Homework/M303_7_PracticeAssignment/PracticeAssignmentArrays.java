package Homework.M303_7_PracticeAssignment;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PracticeAssignmentArrays {
    public static void main(String[] args) {

        // Task 1
        int[] nArray = { 1, 2, 3 };
        for ( int n : nArray ){
            System.out.println(n);
        }
        System.out.println("Task 1 Completed");

        // Task 2
        int[] nArray2 = { 13, 5, 7, 68, 2 };
        int mid = nArray2.length / 2;
        System.out.println(nArray2[mid]);
        System.out.println("Task 2 Completed");

        // Task 3
        String[] nArray3 = { "red", "green", "blue", "yellow" };
        System.out.println("Array length: " + nArray3.length);
        String[] nArray4 = nArray3.clone();
        System.out.println(Arrays.toString(nArray4));
        System.out.println("Task 3 Completed");

        // Task 4
        int[] nArray5 = { 12, 84, 65, 25, 47 };
        System.out.println("First index: " + nArray5[0] + " | Last index: " + nArray5[nArray5.length - 1]);
        // System.out.println("First index: " + nArray5[0] + " | Last index: " + nArray5[5]);
        // Error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        //	at Homework.M303_7_PracticeAssignment.PracticeAssignmentArrays.main(PracticeAssignmentArrays.java:30)
        System.out.println("Task 4 Completed");

        // Task 5
        int[] nArray6 = new int[5];
        for ( int i = 0 ; i < nArray6.length ; i++) {
            nArray6[i] = i;
        }
        for ( int i : nArray6 ){
            System.out.println(i);
        }
        System.out.println("Task 5 Completed");

        // Task 6
        int[] nArray7 = new int[5];
        for ( int i = 0 ; i < nArray7.length ; i++) {
            nArray7[i] = i * 2;
        }
        for ( int i : nArray7 ){
            System.out.println(i);
        }
        System.out.println("Task 6 Completed");

        // Task 7
        int[] nArray8 = { 12, 84, 65, 25, 47 };
        for ( int i = 0 ; i < nArray8.length ; i++) {
            if ( i != (nArray8.length / 2) ){
                System.out.println(nArray8[i]);
            }
        }
        System.out.println("Task 7 Completed");

        // Task 8
        String s1, s2 = "";
        String[] nArray9 = { "red", "green", "blue", "yellow", "white" };
        s1 = nArray9[0];
        s2 = nArray9[2];
        nArray9[2] = s1;
        nArray9[0] = s2;
        for ( String s : nArray9 ){
            System.out.println(s);
        }
        System.out.println("Task 8 Completed");

        // Task 9
        int[] nArray10 = { 4, 2, 9, 13, 1, 0 };
        Arrays.sort(nArray10);
        for (int n : nArray10){
            System.out.print(n + ", ");
        }
        System.out.println("\nSmallest number: " + nArray10[0]);
        System.out.println("Largest number: " + nArray10[nArray10.length - 1]);
        System.out.println("Task 9 Completed");

        // Task 10
        Object[] objArray = new Object[]{ "one", "two", "three", 1.5};
        System.out.println(Arrays.toString(objArray));
        System.out.println("Task 10 Completed");

        // Task 11
        Scanner scanner = new Scanner(System.in);
        System.out.println("How mmany favorite things do you have?");
        int n = scanner.nextInt();
        String[] strArray = new String[n];
        for ( int i = 0 ; i < n ; i++) {
            System.out.print("\nEnter your thing: ");
            strArray[i] = scanner.next();
        }
        System.out.println("Your favorite things are:");
        for (String s : strArray){
            System.out.print(s + " ");
        }


    }
}
