package programs;
import java.util.Random;
import java.util.Scanner;

/**
 * Created class for Rock, Paper, Scissor game.
 */

public class RPS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissor"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.print("Choose wise tarnished.\nRock, Paper or Scissor?: ");
        playerChoice = scanner.nextLine().toLowerCase();

        if(!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")){
            System.out.println("No Strength Builds Allowed, Tarnished");
        }

        computerChoice = choices[random.nextInt(3)];
        System.out.println("Yes.\nBut will it beat " + computerChoice + "?");

        scanner.close();
    }
}
