package Homework.M303_2_2;

public class AutomaticTypePromotion {
    public static void main(String[] args) {

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;

        // Expression
        double result = (f * b) + (i / c) - (d * s);

        // Result
        System.out.println("result: "+ result);

    }
}
