package programs;
import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int diceNum;
        int total = 0;

        System.out.print("Enter # of Dice: ");
        diceNum = scanner.nextInt();

        if(diceNum > 0){
            for(int i = 0; i < diceNum; i++){
                int roll = random.nextInt(7);
                printDie(roll);
                System.out.println("You rolled " + roll);
                total += roll;
            }
            System.out.println("Total: " + total);
        }

        scanner.close();
    }
    static void printDie(int roll){

        String dice1 = " -------\n"
                     + "|       |\n"
                     + "|   ●   |\n"
                     + "|       |\n"
                     + " -------\n";

        String dice2 = " -------\n"
                     + "|   ●   |\n"
                     + "|       |\n"
                     + "|   ●   |\n"
                     + " -------\n";

        String dice3 = " -------\n"
                     + "|   ●   |\n"
                     + "|   ●   |\n"
                     + "|   ●   |\n"
                     + " -------\n";

        String dice4 = " -------\n"
                     + "| ●   ● |\n"
                     + "|       |\n"
                     + "| ●   ● |\n"
                     + " -------\n";

        String dice5 = " -------\n"
                     + "| ●   ● |\n"
                     + "|   ●   |\n"
                     + "| ●   ● |\n"
                     + " -------\n";

        String dice6 = " -------\n"
                     + "| ●   ● |\n"
                     + "| ●   ● |\n"
                     + "| ●   ● |\n"
                     + " -------\n";

        switch(roll){
            case 1 :
                System.out.print(dice1);
                break;
            case 2 :
                System.out.print(dice2);
                break;
            case 3 :
                System.out.print(dice3);
                break;
            case 4 :
                System.out.print(dice4);
                break;
            case 5 :
                System.out.print(dice5);
                break;
            case 6 :
                System.out.print(dice6);
                break;
            default:
                System.out.print("INVALID");
                break;
        }
    }
}