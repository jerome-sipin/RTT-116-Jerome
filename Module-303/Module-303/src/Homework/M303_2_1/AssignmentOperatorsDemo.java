package Homework.M303_2_1;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {

        // Assigning primitive values
        int j, k;
        j = 10;
        j = 5; // previous value is overwritten.
        k = j; // k = 5
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);

        // Multiple assignments
        k = j = 10; // k and j == 10
        System.out.println("j is: " + j);
        System.out.println("k is: " + k);
    }
}
