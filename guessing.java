
import java.util.*;

public class guessing {
    // Function that implements the

    // number guessing game
    public static void guessingNumberGame() {
        // Scanner Class
        Scanner sc = new Scanner(System.in);
        // Generate the numbers
        int digit = 1 + (int) (100 * Math.random());
        // Given K trials
        int trails = 5;
        int i, guess;
        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");
        // Iterate over K Trials
        for (i = 0; i < trails; i++) {
            System.out.println("Guess the number:");
            // Take input for guessing
            guess = sc.nextInt();
            // If the number is guessed
            if (digit == guess) {
                System.out.println("Congratulations! You guessed the number.");
                break;
            } else if (digit > guess && i != trails - 1) {
                System.out.println("The number is greater than " + guess);
            } else if (digit < guess && i != trails - 1) {
                // Scroll for details
                System.out.println("The number is less than " + guess);
            }
        }
        if (i == trails) {
            System.out.println("You have exhausted over trials.");
            System.out.println("The number was " + digit);
        }
    }

    // Driver Code
    public static void main(String arg[]) {
        guessingNumberGame();
    }
}
