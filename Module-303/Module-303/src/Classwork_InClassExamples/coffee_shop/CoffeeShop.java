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

        // load products fromm the file
        List<Product> loaded = new ProductLoader().loadProducts();
        products.addAll(loaded);


        // TODO - Homework #1 - write this function using a for loop
        // use a bubble sort algorithm - look this up on google
        // sort the list of products by price using 2 nested for loops to implement a bubble sort in a function
        // should create a function that will tke in a List<Product> to be sorted and return a sorted List<Product>

        // bubble sort
        boolean swapped;
        for (int i = 0 ; i < products.size() -1 ; i++) {
            swapped = false;
            double temp;
            String temp2;
            for ( int j = 0 ; j < products.size() - i - 1 ; j++) {
                if (products.get(j).getPrice() > products.get(j + 1).getPrice()) {
                    temp = products.get(j).getPrice();
                    temp2 = products.get(j).getName();
                    products.get(j).setPrice(products.get(j + 1).getPrice());
                    products.get(j).setName(products.get(j + 1).getName());
                    products.get(j + 1).setPrice(temp);
                    products.get(j + 1).setName(temp2);
                    swapped = true;
                }
            }
            if (swapped == false){
                break;
            }
            products.forEach(System.out::println);
        }

        // sort using list built-in methods
        // let's sort the list by price
        // stream will not modify the original list that you streamed
        //List<Product> sorted = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();

        // this will modify the original list... using stream will not modify the original list
        //products.sort(Comparator.comparing(Product::getPrice).thenComparing(Product::getName));

        // this just prints the products when we run this we will have to make a fix
        //sorted.forEach(p-> System.out.println(p));

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
        System.out.println("2) Search for product");
        System.out.println("3) Purchase product");
        System.out.println("4) Checkout");
        System.out.println("5) Exit");
        if ( !cart.isEmpty() ) {
            System.out.println("6) Remove product from cart");
        }

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

    // TODO - Homework #2 - create a new main menu option that allows you to search the list of products for a user entered name
    // 1) Ask the user to enter a search phrase "coffee"
    // 2) filter the list of products to show only the products that the match the phrase entered
    // 2b - do not alter the original list of products which means use the .stream()
    // 2c - use a lambda to print out the sorted list using a product.toString() method
    // 2c p1 - create a toString method on your product object
    // 3) Add the search capability to the main menu when you start the coffee shop as a new option
    public void searchProduct() {
        System.out.print("Enter a product name to search for: ");
        String search = scanner.nextLine().toLowerCase();

        // this line of code filters the list of products based if the search input is in the string
        List<Product> results = products.stream().filter(p -> p.getName().toLowerCase().contains(search)).toList();

        // print the result list using a lambda
        results.forEach(p -> System.out.println(p));
        System.out.println("\n");
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

    public void removeProduct(){
        // Print items currently in cart
        for ( int count = 0 ; count < cart.size() ; count++ ) {
            Product p = cart.get(count);
            System.out.println((count+1) + ") " + p.getName() + "\t" + p.getPrice());
        }

        // Prompt user to select which they want to remove
        System.out.println("Select item to remove: ");
        int x = scanner.nextInt();
        x = x - 1;
        String deletedItem = cart.get(x).getName();

        // Remove item from cart
        cart.remove(x);
        System.out.println("Removed " + deletedItem + " from your cart\n");

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
            } else if ( selection == 2) {
                // filter by user input
                searchProduct();
            } else if (selection == 3) {
                // purchase product / add to cart
                addProductToCart();
            } else if (selection == 4) {
                // checkout
                checkout();
            } else if (selection == 5) {
                // exit
                // we are exiting with a value of 0 means successful exit
                System.out.println("Goodbye!");
                System.exit(0);
            } else if (selection == 6 && !cart.isEmpty()) {
                removeProduct();
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
