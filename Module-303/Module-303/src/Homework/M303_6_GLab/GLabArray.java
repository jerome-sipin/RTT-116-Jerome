package Homework.M303_6_GLab;

import java.util.Scanner;

public class GLabArray {
    public static void main(String[] args) {

        // Example 1 - access array elements
        // create an array
        int[] age = {12, 4, 5, 2, 5};
        // access each array elements
        System.out.println("Accessing Elements of an Array:");
        System.out.println("First Element: " + age[0]);
        System.out.println("Second Element: " + age[1]);
        System.out.println("Third Element: " + age[2]);
        System.out.println("Fourth Element: " + age[3]);
        System.out.println("Fifth Element: " + age[4]);

        System.out.println("Example 1 completed");

        // Example 2 - using for loop
        // create an array
        int[] age2 = {12, 4, 5};

        // loop through the array
        // using for loop
        System.out.println("Using for Loop:");
        for (int i = 0; i < age2.length; i++) {
            System.out.println(age2[i]);
        }

        System.out.println("Example 2 completed");

        // Example 3 - iterating over an array using EnhancedForLoop
        String[] names = { "New York", "Dallas", "Las Vegas", "Florida" };
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("Example 3 completed");

        // Example 4 - compute the sum and average of array elements
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int sum = 0;
        Double average;

        // access all elements using for each loop
        // add each element in sum
        for (int number: numbers) {
            sum += number;
        }

        // get the total number of elements
        int arrayLength = numbers.length;

        // calculate the average
        // convert the average from int to double
        average =  ((double)sum / (double)arrayLength);

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

        System.out.println("Example 4 completed");

        // Example 5
        int[] marks = {74, 43, 58, 60, 90, 64, 70};
        int sum2 = 0;
        int sumSq = 0;
        double mean, stdDev;

        // Compute sum and square-sum using loop
        for (int i = 0; i < marks.length; ++i) {
            sum2 += marks[i];
            sumSq += marks[i] * marks[i];
        }
        mean = (double) sum2 / marks.length;
        stdDev = Math.sqrt((double)sumSq / marks.length - mean * mean);

        // Print results
        System.out.printf("Mean is: %.2f%n", mean);
        System.out.printf("Standard deviation is: %.2f%n", stdDev);

        System.out.println("Example 5 completed");

        // Example 6
        int i, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter 10 Elements: ");
        for(i=0; i<10; i++)
            arr[i] = scan.nextInt();

        System.out.print("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;

        System.out.println("\nNow the new array is: ");
        for(i=0; i<11; i++)
            System.out.print(arr[i]+ " ");

        System.out.println("Example 6 completed");
    }
}
