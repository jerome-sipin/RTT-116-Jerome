package Classwork_InClassExamples.M303_8;

public class Rectangle {

    // these are considered class members or class variables
    // they are not directly exposed to the outside world. thus they are private class members
    // encapsulation
    // public can be used by anything.
    // private can only be used by this class.
    private int height;
    private int width;

    // this is the constructor. this one does not take any arguments.
    public Rectangle(){
        // this is run whenever the code contains new Square()
    }

    // we use what are called getters and setters to change the values of height and width
    // this is a very very very common practice in java and we will see it all over the place.
    // this is an example of overloading.
    public void setHeight(int height) {
        // this.height refers to the class-level variable
        // height refers to the parameter shown above.
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    // this is also a constructor. this one takes in 2 arguments
    public Rectangle(int height, int width){
        // whenever you use 'this' it refers to 'this' specific instance
        // important to understand
        this.height = height;
        this.width = width;
    }

    // this method is on all java objects and is used to return a string representation of this object
    public String toString(){
        return "Rectangle [width = " + width + ", height = " + height + "]";
    }

    // these 'p's are encased within the method! that is why there are allowed to be two different
    // 'p's that are the results of two different operations!
    public int calculateArea(){
        int p = width * height;
        return p;
    }

    public int calculatePerimeter(){
        int p = (2 * width + (2 * height));
        return p;
    }

    private void notAvailable(){
        // this is only available within the rectangle class only. it is unavailable outside of it.
    }

    protected void partlyAvailable(){
        // protected is available to everything in the same package.
    }
}
