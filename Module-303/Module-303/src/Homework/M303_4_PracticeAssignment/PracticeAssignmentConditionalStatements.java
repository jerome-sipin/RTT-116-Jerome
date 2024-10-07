package Homework.M303_4_PracticeAssignment;

import java.util.Scanner;

public class PracticeAssignmentConditionalStatements {
    public static void main(String[] args) {

        // Task 1
        int x = 7;
        if ( x < 10 ){
            System.out.println("x is less than 10");
        }
        // change x to 15
        x = 15;
        if ( x < 10 ){
            System.out.println("x is less than 10");
        }
        // no output
        System.out.println("Task 1 Completed");

        // Task 2
        x = 7;
        if ( x < 10 ){
            System.out.println("x is less than 10");
        } else if ( x > 10) {
            System.out.println("x is greater than 10");
        }
        else{
            System.out.println("x is equal to 10");
        }
        // change x to 15
        if ( x < 10 ){
            System.out.println("x is less than 10");
        } else if ( x > 10) {
            System.out.println("x is greater than 10");
        }
        else{
            System.out.println("x is equal to 10");
        }
        System.out.println("Task 2 Completed");

        // Task 3
        x = 15;
        if ( x < 10 ){
            System.out.println("x is less than 10");
        }
        else if ( ( x > 10 ) && ( x <= 20 )) {
            System.out.println("x is between 10 and 20");
        }
        else if (x >= 20) {
            System.out.println("x is greater than 20");
        }
        // change x to 50
        x = 50;
        if ( x < 10 ){
            System.out.println("x is less than 10");
        }
        else if ( ( x > 10 ) && ( x <= 20 )) {
            System.out.println("x is between 10 and 20");
        }
        else if (x >= 20) {
            System.out.println("x is greater than 20");
        }
        System.out.println("Task 3 Completed");

        // Task 4
        x = 15;
        if ( ( x < 10 ) || ( x > 20 )) {
            System.out.println("x is out of range");
        }
        else if ( ( x >= 10 ) && ( x <= 20 )) {
            System.out.println("x is in range");
        }
        else{
            System.out.println("x is out of range");
        }
        // change x to 5
        x = 5;
        if ( ( x < 10 ) || ( x > 20 )) {
            System.out.println("x is out of range");
        }
        else if ( ( x >= 10 ) && ( x <= 20 )) {
            System.out.println("x is in range");
        }
        else{
            System.out.println("x is out of range");
        }
        System.out.println("Task 4 Completed");

        // Task 5
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a grade");
        int grade = scanner.nextInt();

        if ( grade >= 90){
            System.out.println("Your grade is an A");
        }
        else if ( grade >= 80){
            System.out.println("Your grade is a B");
        }
        else if ( grade >= 70){
            System.out.println("Your grade is a C");
        }
        else if ( grade >= 60){
            System.out.println("Your grade is a D");
        }
        else{
            System.out.println("Your grade is a F");
        }
        System.out.println("Task 5 Completed");
        scanner.close();

        // Task 6
        

    }
}
