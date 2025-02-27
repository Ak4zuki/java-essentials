package programs;
import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int diceNum;
        int total;

        System.out.print("Enter # of Dice");
        diceNum = scanner.nextInt();

        if(diceNum > 0){
            for(int i = 0; i < diceNum; i++){
                int roll = random.nextInt(7);
                System.out.println("You rolled " + roll);
            }
        }

    }
}