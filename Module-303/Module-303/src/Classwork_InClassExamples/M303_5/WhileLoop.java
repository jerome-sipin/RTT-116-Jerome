package Classwork_InClassExamples.M303_5;

public class WhileLoop {
    public static void main(String[] args) {

        // this would create an infinite loop because there is nothing changing true to false
//        while ( true ){
//            System.out.println("Inside while loop.")
//        }

        // while loops have some kind of condition
        // this is very similar to a for loop and really a for loop is better than
        String word = "abcdefg";
        int pos = 0;
        while ( pos < word.length() ){
            pos = pos + 1;
            System.out.println("Inside while loop");
        }

        // great example for use of while loops
//        boolean success = false;
//        while ( ! success ){
//            // make an API call attempt
//            if ( apiCall = true ) {
//                success = true;
//            }
//        }

        boolean c = false;
        while ( c ){
            // this code can never execute because the condition on the while loop will
            // get checked and not enter the code
            System.out.println("Inside while loop");
        }

        int x = 5;
        do {
            System.out.println("Inside do while loop");
            x = x + 1;
        }
        while ( x < 5 );



    }
}
