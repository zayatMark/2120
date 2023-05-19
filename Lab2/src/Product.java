//Lab 2: Variant 1

import java.util.Scanner;

public class Product {

    // Attributes of Product
    private String name;
    private final double price;
    private final int quantity;

    // Parametrized constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Default constructor
    public Product() {
        this.name = "Default Product";
        this.price = 0.0;
        this.quantity = 0;
    }

    // Finalizer method for when "Product" class is no longer in use
    @Override
    protected void finalize() {
        System.out.println("Cleaned and finalized " + name);
        // Perform cleanup operations here
    }

    // Implemented getter methods for all the attributes

    public static String getName(Scanner scanner) {
        return scanner.nextLine();
    }

    public static double getPrice(Scanner scanner) {
        return scanDouble(scanner);
    }

    public static int getQuantity(Scanner scanner) {
        return scanInt(scanner);
    }

    //Method to calculate total price of product
    public double calculateTotalPrice(double price, int quantity) {
        return price * quantity;
    }

    //Method to check if the first character of the name is a vowel
    //If it does not return a vowel, the boolean evaluates to false
    public boolean isFirstCharacterVowel(String name) {
        char firstChar = Character.toLowerCase(name.charAt(0));
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
    }

    //Method to display product details
    public void displayDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + calculateTotalPrice(price, quantity));
    }

    //This method ensures valid input from user
    public static double scanDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number:");
            }
        }
    }

    //scanInt ensures the user inputs an integer by displaying an "error" message when it is invalid
    public static int scanInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer:");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String name = getName(scanner);

        System.out.print("Enter product price: ");
        double price = getPrice(scanner);

        System.out.print("Enter product quantity: ");
        int quantity = getQuantity(scanner);

        //Created a new product object using the variables above corresponding to its fields
        Product product = new Product(name, price, quantity);
        product.displayDetails();

        System.out.println("First character of the name is a vowel: " + product.isFirstCharacterVowel(product.name));

        scanner.close();
    }
}