package programs;
import java.util.Random;
import java.util.Scanner;

/**
 * Created class for Rock, Paper, Scissor game.
 */

public class RPS {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        System.out.print("Choose wise tarnished.\nRock, Paper or Scissors?: ");
        playerChoice = scanner.nextLine().toLowerCase();

        if (!playerChoice.equals("rock") &&
                !playerChoice.equals("paper") &&
                !playerChoice.equals("scissors")) {
            System.out.println("No Strength Builds Allowed, Tarnished");
        }else {
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Yes.");
            Thread.sleep(1000);
            System.out.println("But will it defeat " + computerChoice + "?\n");

            if (playerChoice.equals(computerChoice)) {
                System.out.println("A draw. The fates remain in balance.");
            } else if (determineWinner(playerChoice, computerChoice)) {
                System.out.println("You were a worthy foe.");
            } else {
                System.out.println("Jgl Diff. FF15");
            }
        }
        scanner.close();
    }

    static boolean determineWinner(String playerChoice, String computerChoice) {

        boolean win = false;

        if (playerChoice.equals("rock")) {
            switch (computerChoice) {
                case "paper":
                    win = false;
                break;
                case "scissors":
                    win = true;
                break;
            }
        } else if (playerChoice.equals("paper")) {
            switch (computerChoice) {
                case "scissors":
                    win = false;
                break;
                case "rock":
                    win = true;
                break;
            }
        } else if(playerChoice.equals("scissors")){
            switch (computerChoice) {
                case "rock":
                    win = false;
                break;
                case "paper":
                    win = true;
                break;
            }
        }else {
            return false;
        }
        return win;
    }
}