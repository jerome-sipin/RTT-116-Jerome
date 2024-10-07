package M303_4;

import java.util.Scanner;

public class IfStatementExample {
    public static void main(String[] args) {

        double radius = 10;

        if (radius > 10){
            System.out.println("The radius is greater than 10");
        }
        else if (radius < 10){
            System.out.println("The radius is less than 10");
        }
        else{
            System.out.println("The radius is equal to 10");
        }

        // -- booleans

        // if the boolean is set to true, the if statement will always be checking if it is true
        boolean b = true; // this works with the wrapper class, too. (e.g, "Boolean b", instead of "boolean b"
        if (b){ // same thing as if b == true
            System.out.println("b is true");
        }
        if (!b){
            // the same thing as saying if (b == false)
        }

        // -- compound conditionals
        // short circuiting means... in this case, if save is false the JVM will not even evaluate the radius
        if (b && (radius == 50)){
            // both conditions are true
        }
        else{
            // one condition or the other is false or both are false
        }

        // this will short circuit too
        if (b || (radius == 50)){
            // if either condition (or both) are true, then execute here
        }
        else{

        }

        // practice problem - determining a leap year
        // this program first prompts the user to enter a year as an int, and checks if it is a leap year
        // a year is a leap year if it divisible by 4 but not by 100, or it is divisible by 400
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        boolean leapYear;
        if ((year % 4 == 0) && (year % 100 != 0)){
            leapYear = true;
        }
        else if (year % 400 == 0){
            leapYear = true;
        }
        else{
            leapYear = false;
        }
        System.out.println("Is " + year + " a leap year? " + leapYear);

        // grades
        int grade = 30;
        if(grade >= 90){
            System.out.println("A");
        }
        else if (grade >= 80){
            System.out.println("B");
        }
        else if (grade >= 70){
            System.out.println("C");
        }
        else if (grade >= 60){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }

        // case statement / switch statement
        switch(grade){
            case 90: {
                System.out.println("You got a 90");
                break;
            }
            case 80: {
                System.out.println("You got a 80");
                break;
            }
        }


    }
}
