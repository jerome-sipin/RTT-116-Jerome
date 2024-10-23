package Classwork_InClassExamples.M303_9;

import java.util.ArrayList;
import java.util.List;

public class CalcRunner {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.setRadius(10.0);
        c.setName("Circle");

        Circle c1 = new Circle();
        c1.setRadius(15.0);
        c1.setName("Circle 1");

        Triangle t = new Triangle();
        t.setHeight(10.0);
        t.setBase(10.0);
        t.setName("Triangle");

//        Shape sq = new Shape(){
//
//            @Override
//            public double calculateArea() {
//                return 0;
//            }
//
//            @Override
//            public double calculatePerimeter() {
//                return 0;
//            }
//
//            @Override
//            public double CalculateArea(){
//               return 0;
//           }
//        };


        // make a list of shapes bt notice that we are using the parent class shape
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(c);
        shapes.add(c1);
        shapes.add(t);

        // let's loop over all the shapes and calculate the area
        for (Shape s : shapes) {
            double area = s.calculateArea();
            double perimeter = s.calculatePerimeter();
            // when something has been typecasted to its parent, we can still check
            // to see if it is a Triangle by using instanceof
            if (s instanceof Triangle) {
                System.out.println("s is of type Triangle");
            }
            System.out.println("The area for shape " + s.getName() + " is " + area);
            System.out.println("The perimeter for shape " + s.getName() + " is " + perimeter);
        }

    }
}
