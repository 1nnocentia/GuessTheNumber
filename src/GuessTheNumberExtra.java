import java.util.Scanner;
//updated code from GuessTheNumber
public class GuessTheNumberExtra {
    public static void main(String[] args) {
        //Declare Variable
        int guessLevel;
        int numberToGuess;
        int userGuess;
        int attempts = 0;

        //Set up scanner for user input
        Scanner scanner = new Scanner (System.in);

        //Welcome Message
        System.out.println("Welcome to Guess the Number!");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        System.out.print("Choose your level: ");
        guessLevel = scanner.nextInt();
        
        if (guessLevel == 1){
            numberToGuess = (int) (Math.random() * 50) + 1;
            System.out.println("Guess 1 - 50");
        } else if (guessLevel == 2) {
            numberToGuess = (int) (Math.random() * 100) + 1;
            System.out.println("Guess 1 - 100");
        } else {
            numberToGuess = (int) (Math.random() * 200) + 1;
            System.out.println("Guess 1 - 200");
        }
        
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
