package Classwork_InClassExamples.coffee_shop;

public class InvalidInputException extends Exception {

    // 1 - extends Exception
    // 2 - create a constructor that takes a string and calls super to init parent

    public InvalidInputException(String message){
        super(message);
    }


}
