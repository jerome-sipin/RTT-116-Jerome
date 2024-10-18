package Classwork_InClassExamples.M303_12;

public class ExceptionExample {

    public static void main(String[] args) {

        int[] numbers = { 1, 2, 3, 4, 5 };

        // this will try to access the array at position 10, which does not exist.
        // this will throw an exception
        // System.out.println(numbers[10]);
        try {
            // ArithmeticException
            //int x = 10 / 0;

            // ArrayIndexOutOfBoundsException
            //System.out.println(numbers[10]);

            // StringIndexOutOfBoundsException
            String s1 = "abc";
            //s1.charAt(10);

            // NullPointerException
            // this is the most common form of programmer error
            String s2 = null;
            s2.toUpperCase();

            System.out.println("This is the last line of the try catch bloc and will only execute " +
                    "if there is no problem");
        }
        catch ( ArithmeticException e ) {
            // this is the code that will execute when we divide by 0
            System.out.println("Divde by zero exception.");
        }
        catch ( ArrayIndexOutOfBoundsException e ){
            // specifically catching only ArrayIndexOutOfBoundsException
            e.printStackTrace();
            System.out.println("======> " +  e.getMessage());
        }
        catch ( Exception e ){
            // most of the time [Eric] just catches Exception because [he] doesn't care what happened, [he] cares that
            // it failed.
            // all exceptions extend from Exception.
            System.out.println("This is something unexpected: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            // finally block is optional
            // this code will execute no matter what
            // meaning that it will execute in both success or failure cases
            // oftentimes this is because the finally block is used to cleanup or close a resource
            // you need to be able to justify the use of a finally block
            System.out.println("-- finally --");
        }

        // it is okay to continue with code here.

    }

}
