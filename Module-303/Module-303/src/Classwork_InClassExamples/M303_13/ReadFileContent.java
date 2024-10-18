package Classwork_InClassExamples.M303_13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadFileContent {
    public static void main(String[] args){

        File file = new File("src/temp.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            // another style is assigning to and evaluating at the same time
            // !!!! important - when the end of the file is reached, br.readLine() will return null !!!!!
            while ( ( st = br.readLine() ) != null) {

                // Print the string
                System.out.println(st);
            }
        } catch ( Exception e ){
            e.printStackTrace();
        }
    }
}
