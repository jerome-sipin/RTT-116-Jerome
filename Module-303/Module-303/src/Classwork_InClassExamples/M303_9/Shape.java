package Classwork_InClassExamples.M303_9;

public abstract class Shape implements AreaCalculation{

    // there are 2 different techniques for accomplishing polymorphic behavior
    // 1 - by using an interface and allowing the child classes to provide the implementation
    // 2 - by using an abstract method that allows child classes to provide the implementatio

    private String name;

    // this is another way of declaring something that the children must implement
    // abstract methods must be implemented by the children
    public abstract double calculatePerimeter();

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public abstract double CalculateArea();
}
