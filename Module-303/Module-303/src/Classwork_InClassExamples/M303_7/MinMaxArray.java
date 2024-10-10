package Classwork_InClassExamples.M303_7;

public class MinMaxArray {
    public static void main(String[] args){

        int[] values = { 1, 2, 3, 4, 5, 6, 7 };

        // we will initialize these to the first element in the array to make sure that
        // the min and max are indeed in the array's range
        int min = values[0];
        int max = values[0];

        for ( int v : values ){
            if ( v < min ) {
                min = v;
            }
            else if ( v > max ) {
                max = v;
            }
        }

        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

    }
}
