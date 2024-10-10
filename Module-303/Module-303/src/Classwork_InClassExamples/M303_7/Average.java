package Classwork_InClassExamples.M303_7;

public class Average {

    public static void main(String[] args){

        // --- Important !!! ---
        // Eric says that this is very close to the SBA question.
        double[] values = { 1.2, 6.5, 3.2, 9.6, 8.5};

        // the average is the sum of all values divided by the number of values
        double sum = 0;
        // old style for loop
//        for ( int i = 0 ; i < values.length ; i++){
//            sum = values[i] + sum;
//        }
        // new style for loop
        for ( double v : values ){
            sum = v + sum;
        }
        // calculate average and print to console
        double avg = sum / values.length;
        System.out.println("Average is " + avg);




    }

}
