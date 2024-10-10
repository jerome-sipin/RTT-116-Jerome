package Classwork_InClassExamples.M303_8;

public class Runner {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        System.out.println(r1.toString());
        System.out.println("The area is " + r1.calculateArea());
        System.out.println("The perimeter is " + r1.calculatePerimeter());

        // r1.notAvailable();
        // if you uncomment this, it will show an error because this function
        // is set to private
        // refer to rectangle class

        // this is okay because Runner and Rectangle are in the same package
        r1.partlyAvailable();

        r1.setHeight(30);
        r1.setWidth(15);
        System.out.println(r1.toString());
        System.out.println("The area is " + r1.calculateArea());
        System.out.println("The perimeter is " + r1.calculatePerimeter());

        Rectangle r2 = new Rectangle(10, 20);
        System.out.println(r2.toString());
        System.out.println("The area is " + r2.calculateArea());
        System.out.println("The perimeter is " + r2.calculatePerimeter());

        String s1 = "abc";

    }
}
