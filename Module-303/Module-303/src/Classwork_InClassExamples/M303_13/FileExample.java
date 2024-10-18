package Classwork_InClassExamples.M303_13;

import java.io.File;

public class FileExample {

    public static void main(String[] args){
        // the main constructor usgae is the name of the file
        // this can include a partial path or the full path

        // this is considered an absolute path because it contains the rest of the directory and all
        // directories to the file we want
        File absolute = new File("E:\\Development\\RTT-116-Classwork\\Module-303\\Module-303\\src\\temp.txt");

        // relative - starts in the current working directory and goes from there
        File file = new File("src/temp.txt");

        System.out.println(file.getAbsolutePath());
        // Exists = most used
        System.out.println("exists " + file.exists());
        System.out.println("is Directory " + file.isDirectory());
        System.out.println("is Hidden " + file.isHidden());
        System.out.println("can read " + file.canRead());
        System.out.println("can write " + file.canWrite());
        System.out.println("can execute " + file.canExecute());
        System.out.println("size " + file.length());

        if ( file.isDirectory() ){
            // let's list the files in this directory
            File[] files = file.listFiles();
            for ( File f : files ){
                System.out.println("====> " + f.getName());
            }

        }

        // Be careful when modifying a file in Java. You cannot ctrl + z or take it back
        // or whatever. It's done. For example, if you were to .delete an entire drive, Java would do it.
        // file.delete();

        // example for creating a new directory
        File newDirectory = new File("asdf");
        // check to see if 'asdf' directory exists. if not, create it.
        if ( ! newDirectory.exists() ){
            newDirectory.mkdir();
        }


    }
}
