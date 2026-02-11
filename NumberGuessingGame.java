import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int min = 1;
        int max = 100;
        int randomNumber = rand.nextInt(max - min + 1) + min;

        int guess;
        int attempts = 0;
        int maxAttempts = 10;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number between 1 and 100");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("Attempts used: " + attempts);
                break;
            } 
            else if (guess < randomNumber) {
                System.out.println("Too low! Try a higher number.");
            } 
            else {
                System.out.println("Too high! Try a lower number.");
            }
        }

        if (attempts == maxAttempts) {
            System.out.println("Game Over! You've used all attempts.");
            System.out.println("The correct number was: " + randomNumber);
        }

        sc.close();
    }
}