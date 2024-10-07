package Classwork_InClassExamples.perscholas;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        System.out.println("Enter the radius of the circle");

        Scanner scanner = new Scanner(System.in);

        // IMPORTANT!!!
        // after scanning a number, we need to do a scanner.nextLine() to throw
        // the new line character (which was created when you pressed enter on the keyboard)
        // into the garbage.
        double x = scanner.nextDouble();

        // calling nextLine after nextDouble will consume the new line character from the scanner
        // and essentially throw it in the garbage. This will leave the scanner empty so the next line the
        // user enters data as we can capture it without having leftovers from the previous call
        scanner.nextLine();

        System.out.println("You have entered a radius of " + x);

        double area = x*x * 3.14159;

        System.out.println("The area of the circle is " + area);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Your name is: " + name);


    }
}
