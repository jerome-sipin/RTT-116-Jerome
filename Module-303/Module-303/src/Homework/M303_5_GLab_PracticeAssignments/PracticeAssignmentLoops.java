package Homework.M303_5_GLab_PracticeAssignments;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PracticeAssignmentLoops {
    public static void main(String[] args) {

        // Task 1 - print a multiplication table
        for ( int i = 1 ; i <= 12 ; i++){
            for ( int j = 1 ; j <= 12 ; j++){
                System.out.print( i * j + " ");
            }
            System.out.print("\n");
        }
        System.out.println("End of Task 1");

        // Task 2 - find greatest common divisor
        int x, y;
        int gcd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = scanner.nextInt();
        System.out.print("Enter the second number: ");
        y = scanner.nextInt();

        // find gcd
        for ( int i = 1 ; i < x ; i++){
            for ( int j = 1 ; j < y ; j++){
                if ( (x % j == 0) && (y % j == 0) ){
                    gcd = j;
                }
            }
        }
        System.out.println("The greatest common divisor is " + gcd);
        System.out.println("End of task 2");

        // Task 3 - predict future tuition
        double tuitionOriginal = 10000;
        double currentTuition = 10000;
        int i = 1;
        while ( (currentTuition / tuitionOriginal) <= 2 ){
            currentTuition = currentTuition * 1.07;
            i++;
        }
        DecimalFormat df = new DecimalFormat("##,###.##");
        System.out.println("It took " + i + " years for tuition to double. \nTuition is now $" + df.format(currentTuition));
        System.out.println("End of task 3");

    }
}
