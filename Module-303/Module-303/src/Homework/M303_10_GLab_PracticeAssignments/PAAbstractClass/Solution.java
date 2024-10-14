package Homework.M303_10_GLab_PracticeAssignments.PAAbstractClass;

import java.io.*;
import java.util.*;
import java.util.Scanner;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class myBook extends Book {
    public void setTitle(String title) {
        this.title = title;
    }
}

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String title;
        myBook b1 = new myBook();
        Scanner scanner = new Scanner(System.in);
        title = scanner.nextLine();
        b1.setTitle(title);
        System.out.println("The title is: " + b1.getTitle());
        scanner.close();
    }
}
