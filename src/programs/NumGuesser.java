package programs;
import java.util.Random;
import java.util.Scanner;

public class NumGuesser {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int randomNumber = random.nextInt(100);

        System.out.println("Number Guessing Game");
        System.out.println("Guess a random number between 1-100");

        do {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too Low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too High! Try again.");
            } else {
                System.out.println("Correct! the number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }

        } while (guess != randomNumber);

        scanner.close();
    }
}