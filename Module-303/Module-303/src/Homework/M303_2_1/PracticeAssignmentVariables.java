package Homework.M303_2_1;

import java.text.DecimalFormat;

public class PracticeAssignmentVariables {
    public static void main(String[] args) {

        // Write a program that declares two integer variables, assigns an integer to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        int x = 9;
        int y = 10;
        int sum = x + y;
        System.out.println("Sum is: " + sum);

        // Write a program that declares two double variables, assigns a number to each, and adds them together.
        // Assign the sum to a variable. Print out the result.
        double a = 10.5;
        double b = 11.1;
        double sum2 = a + b;
        System.out.println("Sum is: " + sum2);

        // Write a program that declares an integer variable and a double variable, assigns numbers to each, and
        // adds them together. Assign the sum to a variable. Print out the result. What variable type must the sum be?
        int c = 5;
        double d = 5.5;
        double sum3 = c + d;
        System.out.println("Sum is: " + sum3);
        // sum 3 must be a double because 5 + 5.5 == 10.5

        // Write a program that declares two integer variables, assigns an integer to each, and divides the larger
        // number by the smaller number. Assign the result to a variable. Print out the result. Now change the larger
        // number to a decimal. What happens? What corrections are needed?
        int e = 10;
        int f = 20;
        int q = f / e;
        System.out.println("Quotient is: " + q);
        // Change the larger number to a decimal gives the below error:
        // java: incompatible types: possible lossy conversion from double to int
        // Fix -> change variables f and q data type to double, as shown below.
        // int e = 10;
        // double f = 20;
        // double q = f / e;
        // System.out.println("Quotient is: " + q);
        // Output is 2.0

        // Write a program that declares two double variables, assigns a number to each, and divides the larger
        // by the smaller number. Assign the result to a variable. Print out the result.
        // Now, cast the result to an integer. Print out the result again.
        double g = 10.0;
        double h = 50.0;
        double q2 = h / g;
        System.out.println("Quotient is: " + q2);
        // Cast q2 as an int
        int q3 = (int) q2;
        System.out.println("Quotient is: " + q3);

        // Write a program that declares two integer variables, x and y, and assigns the number 5 to x
        // and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now, cast y to a double and
        // assign it to q. Print q again.
        int i = 5;
        int j = 6;
        double q4 = j / i;
        System.out.println("Quotient is: " + q4);
        // Cast j as double and re-print
        double j2 = (double)j;
        double q5 = j2 / i;
        System.out.println("Quotient is: " + q5);

        // Write a program that declares a named constant and uses it in a calculation. Print the result.
        // Declare final constant
        final double pi = 3.14159;
        int radius = 3;
        double area = radius * radius * pi;
        System.out.println("Area is: " + area + " units^2");

        // Write a program where you create three variables that represent products at a cafe. The products could be
        // beverages like coffee, capuccino, espresso, green tea, etc... Assign prices to each product. Create two
        // more variables called subtotal and totalSale and complete an order for three items of the first product,
        // four items of the second product, and two items of the third product. Add them all together to calculate
        // the subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale
        // amount. Be sure to format the results to two decimal places.

        // Create 3 "items" and price them
        double coffee = 2.99;
        double matcha = 3.99;
        double sandwich = 4.99;


        // Create subtotal/totalSale
        double subtotal;
        double totalSale;

        // Create SALES_TAX
        final double SALES_TAX = 2.15;

        // Calculate subtotal
        subtotal = (coffee * 3) + (matcha * 4) + (sandwich * 2);

        // Calculate totalSale
        totalSale = subtotal + SALES_TAX;

        // Formatting
        String pattern = "$###.##";
        DecimalFormat numberFormat = new DecimalFormat(pattern);
        String totalSaleFinal = numberFormat.format(totalSale); // note - return tye after DecimalFormat is a String
        System.out.println("Total sale is: " + totalSaleFinal);
    }
}
