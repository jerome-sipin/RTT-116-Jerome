package Homework.M303_2_1_GuidedLab;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {

        int x, y = 10;
        int z = 5;

        x = y + z;
        System.out.println(" + operator resulted in " + x);

        x = y - z;
        System.out.println(" - operator resulted in " + x);

        x = y * z;
        System.out.println(" * operator resulted in " + x);

        x = y / z;
        System.out.println(" / operator resulted in " + x);

        x = y % z;
        System.out.println(" % operator resulted in " + x);

        x = y++;
        System.out.println(" Postfix++ operator resulted in " + x);

        x = ++z;
        System.out.println(" Prefix++ operator resulted in " + x);

        x = -y;
        System.out.println(" Unary operator resulted in " + x);

        // Special cases examples
        // Above/below max/min value
        int tooBig = Integer.MAX_VALUE + 1; // -2147483648
        int tooSmall = Integer.MIN_VALUE - 1; // 2147483647
        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);
        // Infinity/NaN
        System.out.println(4.0 / 0.0); // infinity
        System.out.println(-4.0 / 0.0); // -infinity
        System.out.println(0.0 / 0.0); // NaN
        // Dividing integers with non-whole quotients
        double d1 = 12 / 8;
        double d2 = 12.0F / 8;
        System.out.println("d1 is "+ d1 );
        System.out.println("d2 is "+ d2 );
    }
}
