package Classwork_InClassExamples.M303_9;

public class Runner {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(10.0); // this is implemented in the circle class
        c.setPI(4);
        c.setName("Circle"); // this is implemented in the shape class
        System.out.println(c.getName() + " = " + c.getPI());


        Triangle t = new Triangle();
        t.setBase(10.0);
        t.setHeight(20);
        t.setName("Triangle");


    }
}
