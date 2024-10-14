package Classwork_InClassExamples.perscholas;

public class BasicJavaSBAReview {

    public static void main(String[] args){

        double[] numbers = { 4.3, 5.6, 7.2, 1.4, 5.2, 9.8};

        // calculate the average of all elements of the array.

        // with a new style for loop
        double sum = 0.0;
        for (double number : numbers){
            sum = sum + number;
        }

        double avg = sum / (double)numbers.length;
        System.out.println("The average is " + avg);

    }

}
