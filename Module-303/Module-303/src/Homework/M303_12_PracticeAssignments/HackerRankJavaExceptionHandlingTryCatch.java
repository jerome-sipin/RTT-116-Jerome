package Homework.M303_12_PracticeAssignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HackerRankJavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z;

        Scanner scanner = new Scanner(System.in);
        try {
            x = scanner.nextInt();
            y = scanner.nextInt();
            z = x / y;
            System.out.println(z);
        } catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
