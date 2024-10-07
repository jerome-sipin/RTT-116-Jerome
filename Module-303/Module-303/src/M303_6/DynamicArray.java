package M303_6;

import java.util.Arrays;

public class DynamicArray {

    // pos = 0123456789
    // val = 1234567891
    //                0


    public static double[] insert(double[] array, int position, double value){
        // step 1 - we need to make a new array that is of size one larger
        double[] result = new double[array.length + 1];

        // step 2 - copy all the elements from 0 to the position we insert to the new array
        for ( int pos = 0 ; pos < position ; pos++ ) {
            result[pos] = array[pos];
        }

        // step 3 - we set the incoming value at the insert position
        result[position] = value;

        // step 4 - #wemove the remaining values to the end of the new array
        // this is the important part
        for (int pos = position; pos < array.length; pos++) {
            result[pos + 1] = array[pos];
        }

        // step 5 - return the resulting array
        return result;
    }

    public static double[] delete(double[] array, int position){
        // boundary condition
        if ( ( position >= array.length ) || ( position < 0 ) ) {
            System.out.println("Error: position out of bounds");
            return array;
        }

        // step 1 - create a new array that is 1 smaller
        double[] result = new double[array.length - 1];

        // step 2 - copy all the elements from 0 to the position we insert to the new array
        for ( int pos = 0 ; pos < position ; pos++){
            result[pos] = array[pos];
        }

        // shift remaining values left or back by 1
        for (int pos = position + 1; pos < array.length ; pos++){
            result[pos - 1] = array[pos];
        }
        return result;
    }

    public static double[] append(double[] array, double value){
        double[] result = new double[array.length + 1];

        for ( int pos = 0 ; pos < array.length ; pos++ ) {
            result[pos] = array[pos];
        }
        result[array.length] = value;


        return result;
    }



    public static void main(String[] args) {

        double[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        numbers = insert(numbers, 3, 3.5);

        System.out.println(Arrays.toString(numbers));

        numbers = delete(numbers, 8); // this will delete the value 7 fromm the array

        System.out.println(Arrays.toString(numbers));

        numbers = append(numbers, 15);

        System.out.println(Arrays.toString(numbers));

    }
}
