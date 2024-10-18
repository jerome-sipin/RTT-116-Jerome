package Classwork_InClassExamples.M303_13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFileExample {

    public static void main(String[] args) {

        File file = new File("src/temp1.txt");

        BufferedWriter bw = null;
        try {

            // creating a new file writer with a single argument (file) it will overwrite the existing file
            // and create a new one with the same name
            bw = new BufferedWriter(new FileWriter(file));

            // if you want to append the text to the end of an existing file, you can add "true" as a second
            // argument. Example below:
            // BufferedWriter bw = new BufferedWriter(new FileWriter(file), true);

            bw.write("q\n");
            bw.write("w\n");
            bw.write("e");
            bw.write(" rtyuuiop\n");

            // we are not writing to the file, we are actually writing to a buffer in memory
            // when the buffer fills it will automatically write the buffer to the file as a chunk
            // as an engineer... we have finished writing all that we want to write ito the file
            // the final buffer may not have completely filled and we have a partial buffer
            // we need to flush that buffer to force it to write whatever it has to the file even though
            // it is not full
            bw.flush();

            // this closes the writer and releases resources at the OS level
            // technically, the best practice is that this close should be inn a finally block of the try catch.
            bw.close();

        } catch (Exception e) {
            // we don't care what happened, we just care that we were unsuccessful
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch ( Exception e ){
                    // well we tried.
                }
            }
        }


    }
}
