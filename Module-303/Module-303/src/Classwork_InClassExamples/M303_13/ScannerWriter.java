package Classwork_InClassExamples.M303_13;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScannerWriter {

    public static void main(String[] args) {

        // character input stream that the user types on the keyboard
        // and the scanner is going to wait for the human to do it
        Scanner scanner = new Scanner(System.in);


        try {
            File file = new File("src/temp2.txt");
            PrintWriter pw = new PrintWriter(file);

            System.out.print("Enter a string to write to the file: ");

            String input = scanner.nextLine();

            pw.println(input);

            // !!!!!! always reember to flush your streams so that the file output works!!!
            pw.flush();

        } catch ( Exception e ){

        }
    }
}
