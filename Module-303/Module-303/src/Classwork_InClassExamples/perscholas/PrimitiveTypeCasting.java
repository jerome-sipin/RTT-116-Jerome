package Classwork_InClassExamples.perscholas;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {

        int x = 5;

        // because y is an integer, it can only be a whole number
        int y = 5 / 2;
        System.out.println(y); //output == 2

        // I am dividing 2 whole numbers that are integers and putting the result into a double,
        // which gives the same answer of 2.0
        double z = 5 / 2;
        System.out.println(z); //output == 2.0

        // this will give us the proper answer of 2.5 because we used two double values in our division
        double d = 5.0 / 2.0;
        System.out.println(d); // output == 2.5

        // we can also use type casting, which (in this scenario)
        // converts the two integers into doubles before doing the operation
        double e = (double)5 / (double)2;
        System.out.println(e); // output == 2.5

        // can also work with variables
        int j = 5;
        int k = 2;
        double f = (double)j / (double)k;
        System.out.println(f); // output == 2.5

    }
}
