package Classwork_InClassExamples.M303_9;

public class Circle extends Shape {

    // when we use the static keyword... there is only one variable PI for all instances of circle
    // if you have 10 instances of a circle class, you will have one instance of PI
    private static double PI = 3.14159;

    private double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public static double getPI(){
        return PI;
    }

    public static void setPI(double PI){
        Circle.PI = PI;
    }

    @Override
    public double calculateArea() {
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return (2 * Math.PI * radius);
    }
}
