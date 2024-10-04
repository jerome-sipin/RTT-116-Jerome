package Homework.M303_2_2;

import java.util.Scanner;

public class PracticeAssignmentScanner {
    public static void main(String[] args) {

        // Task 1 - Read 3 integers from input and then print them. Each integer must be printed on a new line.

        Scanner scanner = new Scanner(System.in);
        // Declare int array because I'm feeling extra. Declares a blank array with 4 blank spaces.
        // "new int[2]" should work I think, but java runs an error if I try that.
        int[] userNums = new int[3];
        // While loop. Will continue until 3 numbers have been entered, and append all to an array.
        int i = 0;
        while (i <= 2) {
            System.out.println("Enter a number: ");
            userNums[i] = scanner.nextInt();
            scanner.nextLine();
            i++;
        }

        // While loop. Prints out numbers in the array in the order that the user put them in.
        int j = 0;
        while (j <= 2) {
            System.out.println(userNums[j]);
            j++;
        }

        // Task 2 - Read and write an integer, a double, and a string.
        // Too complicated for me to want to figure out how to do a loop, so I will be solving this
        // conventionally.
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int x = scanner2.nextInt();
        scanner2.nextLine();

        System.out.println("Enter a double: ");
        double y = scanner2.nextDouble();
        scanner2.nextLine();

        System.out.println("Enter a string: ");
        String z = scanner2.nextLine();
        scanner2.nextLine();

        System.out.println("String: " + z);
        System.out.println("Double: " + y);
        System.out.println("Int: " + x);

    }
}
