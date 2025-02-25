import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Declare variables
        int numberToGuess;
        int userGuess;
        int attempts = 0;

        // Generate a random number between 1 and 100
        numberToGuess = (int) (Math.random() * 100) + 1;

        // Set up the scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Welcome message
        System.out.println("Welcome to Guess the Number!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it!");

        // Game loop: prompt for user guesses until correct
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (userGuess != numberToGuess);

        // Clean up by closing the scanner
        scanner.close();
    }
}