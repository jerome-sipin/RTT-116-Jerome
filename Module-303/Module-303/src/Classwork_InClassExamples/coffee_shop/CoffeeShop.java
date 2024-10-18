package Classwork_InClassExamples.coffee_shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeShop {

    // Create a scanner at the class level, because we will bbe using this in several functions to read input from
    // the user
    private Scanner scanner = new Scanner(System.in);

    // this is a class level variable that will contain our list of products for sale
    // the best practice is to define these at the toop of the class
    private List<Product> products = new ArrayList<>();

    // this will hold the products that the user will purchase
    private List<Product> cart = new ArrayList<>();



    private void initProducts() {
        Product p1 = new Product("Small Coffee", 4.57, 0);
        products.add(p1);

        Product p2 = new Product("Large Coffee", 7.99, 0);
        products.add(p2);

        Product p3 = new Product("Sugar Cookie", 5.89, 0);
        products.add(p3);

        Product p4 = new Product("Egg Sandwich", 6.49, 0);
        products.add(p4);
    }

    private void printProductMenu() {
        for ( int count = 0 ; count < products.size() ; count++ ) {
            Product p = products.get(count);
            System.out.println((count+1) + ") " + p.getName() + "\t" + p.getPrice());
        }

        // give some white space after printing
        System.out.println("\n");
    }

    private int printMainMenu() throws InvalidInputException {
        System.out.println("1) See product menu");
        System.out.println("2) Purchase product");
        System.out.println("3) Checkout");
        System.out.println("4) Exit");

       return readNumberFromUser("\n Enter selection:");
    }

    // by adding the throws clause here, I am specifically saying this function can (but may not) throw
    // an exception called InvalidInputException
    private int readNumberFromUser(String question) throws InvalidInputException {
        System.out.print(question);
        try {
            int selection = scanner.nextInt();
            // normally a return stops execution of code at that point and executes the function
            // **** !!!!!!! in this case, it will still call the finally block. the finally block will ALWAYS execute!
            return selection;
        }
        catch (Exception e ){
            // this is logic we are adding as an engineer do we know there was a problem
            // this is not always the best of handling things
            System.out.println("Invalid input: " + e.getMessage());
            throw new InvalidInputException("Invalid input: " + e.getMessage());
        }
        finally {
            // this is a god example of usage for a finally block is to clear the Scanner so it is ready for the
            // next time this function is called
            scanner.nextLine();
        }
    }

    public void addProductToCart() throws InvalidInputException {
        //1 display the items for sale
        printProductMenu();

        // 2 prompt the user to enter an item # to buy
        int selection = readNumberFromUser("Enter product number: ");

        // we want to check that the user has entered a valid product number
        if ( isProductSelectionValid(selection) ) {

            // 3 add to the cart array
            // we are subtracting 1 from the user input to get the real position in the array
            // because most people do not have a concept of the 0th item in a list
            Product p = products.get(selection - 1);
            // Ask how many items of this type the user wants to add. Use another loop to add x number of items to cart.
            int quantity = readNumberFromUser("Enter quantity to buy: ");
            for ( int i = 0 ; i < quantity ; i++ ) {
                cart.add(p);
            }
            System.out.println("Added " + quantity + " " +p.getName() + "s to your cart");
            System.out.println("\n");
        }
        else {
            System.out.println("Invalid selection");
        }
    }

    private boolean isProductSelectionValid(int selection) {
        if ( selection >= 1 && selection <= products.size()){
            return true;
        }

        return false;
    }

    public void checkout(){
        System.out.println("===== Items in your cart =====");
        // list the items in the cart
        double subtotal = 0.0;
        for ( Product item : cart ) {
            System.out.println(item.getName() + "\t" + "$" + item.getPrice());
            subtotal = subtotal + item.getPrice();
        }
        System.out.println("");
        System.out.println("Subtotal\t\t" + "$" + subtotal);
        // calculate tax
        double tax = subtotal * 0.09;
        System.out.println("Tax\t\t\t\t" + "$" + tax);
        // calculate total amount
        double total = (subtotal + tax);
        System.out.println("Total\t\t\t" + "$" + total);
        System.out.println("\n");
    }

    public void start() throws InvalidInputException {
        // this becomes similar to the main method in that it will be where our project starts and runs
        // 1) initialize the products for sale
        initProducts();

        // repeat forever until the user enters selection 4, which will exit the program
        while (true) {
            // print the menu and get ack the user selected input
            int selection = printMainMenu();

            if (selection == 1) {
                printProductMenu();
            } else if (selection == 2) {
                // purchase product / add to cart
                addProductToCart();
            } else if (selection == 3) {
                // checkout
                checkout();
            } else if (selection == 4) {
                // exit
                // we are exiting with a value of 0 means successful exit
                System.out.println("Goodbye!");
                System.exit(0);
            }
            else{
                System.out.println("Invalid selection" + "\n");
            }
        }

    }

    public static void main(String[] args) throws InvalidInputException {
        // the goal is to get out of the static method, as you can only use static variables and such inside of it.
        CoffeeShop cs = new CoffeeShop();
        cs.start();
    }
}
