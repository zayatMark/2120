import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program swaps two integers and two floating-point numbers.");
        System.out.println("Enter an integer:");
        int firstInt = scanInt(scanner);

        System.out.println("Enter another integer:");
        int secondInt = scanInt(scanner);

        System.out.println("Enter a floating-point number:");
        double firstDouble = scanDouble(scanner);

        System.out.println("Enter another floating-point number:");
        double secondDouble = scanDouble(scanner);

        //With overloading, these methods can stay nearly the same but take different arguments.
        swapTwoNumbers(firstInt, secondInt);
        swapTwoNumbers(firstDouble, secondDouble);
    }

    //scanInt and scanDouble ensure valid input
    private static int scanInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer:");
            }
        }
    }

    private static double scanDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a floating-point number:");
            }
        }
    }

    public static void swapTwoNumbers(int firstInt, int secondInt) {
        int temp;
        temp = firstInt;
        firstInt = secondInt;
        secondInt = temp;
        System.out.println("Here are the switched values:");
        System.out.println("First integer = " + firstInt);
        System.out.println("Second integer = " + secondInt);
    }

    public static void swapTwoNumbers(double firstDouble, double secondDouble) {
        double temp;
        temp = firstDouble;
        firstDouble = secondDouble;
        secondDouble = temp;
        System.out.println("First floating-point number = " + firstDouble);
        System.out.println("Second floating-point number = " + secondDouble);
    }
}
