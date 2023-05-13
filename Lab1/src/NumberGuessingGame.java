import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NUMBER GUESSING GAME (WITH SUPER-FUN BONUS MODE!)");
        //Two game modes available. See report for description of method overload implementation
        System.out.println("If you would like to guess a number from 1-100, enter 0.");
        System.out.println("If you would like to define your own range, enter 1.");

        int targetNumber;
        //This while loop checks for valid input using the scanInt method defined below
        int playerChoice = scanInt(scanner);
        while (!(playerChoice == 0 || playerChoice == 1)) {
            System.out.println("Invalid input, enter 0 or 1 to begin.");
            playerChoice = scanInt(scanner);
        }

        if (playerChoice == 0) {
            //targetNumber is a random number between 1 and 100
            targetNumber = randomNumberGenerator(100);
            System.out.println("Guess a number between 1 and 100.");
            playGame(targetNumber);
        } else {
            System.out.println("Enter the minimum value:");
            int min = scanInt(scanner);
            System.out.println("Enter the maximum value:");
            int max = scanInt(scanner);
            while (!(max > min)) {
                System.out.println("The maximum value must be greater than the minimum value.");
                max = scanInt(scanner);
            }
            System.out.println("Your range is from " + min + " to " + max + ". Enter your first guess.");
            targetNumber = randomNumberGenerator(min, max);
            //The playGame method is the same for both game modes.
            // If choice is 1, the logic above takes in min and max values used to generate a number in rNG function
            //targetNumber is a playGame argument in both game modes
            playGame(targetNumber);
        }
    }

    //scanInt ensures the user inputs an integer by displaying an "error" message when it is invalid
    private static int scanInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter an integer:");
            }
        }
    }

    //The rNG method is defined twice because there are 2 game modes
    //See report for more details on this and method overload implementation
    public static int randomNumberGenerator(int range) {
        Random random = new Random();
        return random.nextInt(range) + 1;
    }

    public static int randomNumberGenerator(int min, int max) {
        Random random = new Random();
        //The line below uses the nextInt method to generate a number between min and max
        return random.nextInt(max - min + 1) + min;
    }

    public static void playGame(int targetNumber) {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;
        //These values get updated in the loop below. "guess" holds the player's next guess
        //no. of attempts becomes "Score" when user guesses the number

        while (guess != targetNumber) {
            guess = scanInt(scanner);
            attempts++;

            //This block tells the user if their guess was too low or too high
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
        }
        if (attempts == 1) {
            System.out.println("You got the number in one guess! You are legendary.");
        } else {
            System.out.println("You win!, Score: " + attempts);
        }
    }
}
