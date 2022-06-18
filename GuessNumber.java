// import necessary classes
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        // create upper bound of random number (1 less than value)
        int upperBound = 100;

        // create random instance
        Random rand = new Random();

        // create random number from 1 to 100
        int randomNumber = rand.nextInt(upperBound) + 1;

        // instantiate a Scanner object
        Scanner scan = new Scanner(System.in);

        // create variable for user guess
        int userGuess;

        // variable to continue game
        String gameStop;

        // give user instructions
        System.out.println("Guess a random number between 1 and 100: ");

        // run loop where user tries to guess random number
        do {
            userGuess = scan.nextInt();
            if (userGuess > randomNumber) {
                System.out.println("Too high, guess again!");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low, guess again!");
            } else {
                System.out.println("You won!");
                break;
            }
            System.out.println("Do you want to keep playing? Type 'no' to quit or 'yes' to keep playing!");
            scan.nextLine();
            gameStop = scan.nextLine();
            if (gameStop.equals("no")) {
                System.out.println("Game over, you lost.");
                break;
            } else {
                System.out.println("Guess again: ");
                continue;
            }
        } while (userGuess != randomNumber);

        // prevent memory leak
        scan.close();
    }
}