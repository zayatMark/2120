import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program uses a two-step process to find the smallest of three numbers.");

        System.out.println("Enter a number:");
        double firstNum = scanDouble(scanner);

        System.out.println("Enter a second number:");
        double secondNum = scanDouble(scanner);

        System.out.println("Enter a third number:");
        double thirdNum = scanDouble(scanner);

        //The first method call compares the first 2 numbers. The second compares all 3 at once
        smallestOf(firstNum, secondNum);
        smallestOf(firstNum, secondNum, thirdNum);
    }

    //This method ensures valid input from user
    private static double scanDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a number:");
            }
        }
    }

    //Math.min is an easy way to find the smallest value between two numbers
    public static void smallestOf(double firstNum, double secondNum) {
        double smallest = Math.min(firstNum, secondNum);
        System.out.println("The smallest of your first two numbers is: " + smallest);
    }

    public static void smallestOf(double firstNum, double secondNum, double thirdNum) {
        double smallest = Math.min(firstNum, Math.min(secondNum, thirdNum));
        System.out.println("The smallest of your three numbers is: " + smallest);
    }
}
