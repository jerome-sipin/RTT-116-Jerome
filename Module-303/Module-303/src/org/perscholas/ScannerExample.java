package org.perscholas;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        System.out.println("Enter the radius of the circle");

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println("You have entered a radius of " + x);

        double area = x*x * 3.14159;

        System.out.println("The area of the circle is " + area);

    }
}
