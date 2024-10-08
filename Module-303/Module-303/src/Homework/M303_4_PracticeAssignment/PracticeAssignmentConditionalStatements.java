package Homework.M303_4_PracticeAssignment;

import java.util.Scanner;

public class PracticeAssignmentConditionalStatements {
    public static void main(String[] args) {

        // Task 1
        int x = 7;
        if (x < 10) {
            System.out.println("x is less than 10");
        }
        // change x to 15
        x = 15;
        if (x < 10) {
            System.out.println("x is less than 10");
        }
        // no output
        System.out.println("Task 1 Completed");

        // Task 2
        x = 7;
        if (x < 10) {
            System.out.println("x is less than 10");
        } else if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is equal to 10");
        }
        // change x to 15
        if (x < 10) {
            System.out.println("x is less than 10");
        } else if (x > 10) {
            System.out.println("x is greater than 10");
        } else {
            System.out.println("x is equal to 10");
        }
        System.out.println("Task 2 Completed");

        // Task 3
        x = 15;
        if (x < 10) {
            System.out.println("x is less than 10");
        } else if ((x > 10) && (x <= 20)) {
            System.out.println("x is between 10 and 20");
        } else if (x >= 20) {
            System.out.println("x is greater than 20");
        }
        // change x to 50
        x = 50;
        if (x < 10) {
            System.out.println("x is less than 10");
        } else if ((x > 10) && (x <= 20)) {
            System.out.println("x is between 10 and 20");
        } else if (x >= 20) {
            System.out.println("x is greater than 20");
        }
        System.out.println("Task 3 Completed");

        // Task 4
        x = 15;
        if ((x < 10) || (x > 20)) {
            System.out.println("x is out of range");
        } else if ((x >= 10) && (x <= 20)) {
            System.out.println("x is in range");
        } else {
            System.out.println("x is out of range");
        }
        // change x to 5
        x = 5;
        if ((x < 10) || (x > 20)) {
            System.out.println("x is out of range");
        } else if ((x >= 10) && (x <= 20)) {
            System.out.println("x is in range");
        } else {
            System.out.println("x is out of range");
        }
        System.out.println("Task 4 Completed");

        // Task 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        if (grade >= 90) {
            System.out.println("Your grade is an A");
        } else if (grade >= 80) {
            System.out.println("Your grade is a B");
        } else if (grade >= 70) {
            System.out.println("Your grade is a C");
        } else if (grade >= 60) {
            System.out.println("Your grade is a D");
        } else {
            System.out.println("Your grade is a F");
        }
        System.out.println("Task 5 Completed");

        // Task 6
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7");
        int n1 = scanner2.nextInt();
        switch (n1) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Out of range");
        }
        System.out.println("Task 6 Completed");

        // Task 7
        // Simplified to single tax bracket only.
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("Enter your income (rounded to the nearest dollar): ");
        int income = scanner3.nextInt();
        // Set tax rate
        double taxRate = 0.0;
        if ( (income > 0 ) && ( income <= 8350 )) {
            taxRate = 0.10;
        }
        else if ( ( income > 8351 ) && ( income <= 33950 )) {
            taxRate = 0.15;
        }
        else if ( ( income > 33951 ) && ( income <= 82250 )) {
            taxRate = 0.25;
        }
        else if ( ( income > 82251 ) && ( income <= 171550 )) {
            taxRate = 0.28;
        }
        else if ( ( income > 171551 ) && ( income <= 372950 )) {
            taxRate = 0.33;
        }
        else if ( income > 372951 ) {
            taxRate = 0.35;
        }
        else {
            System.out.println("Out of range");
        }
        // Return total tax
        double totalTax = income * taxRate;
        System.out.println("Total tax is " + totalTax);



    }
}
