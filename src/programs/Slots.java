package programs;
import service.SlotsService;

import java.util.Random;
import java.util.Scanner;

public class Slots {
    public static void main(String[] args) throws InterruptedException{

        Scanner scanner = new Scanner(System.in);

        int balance = 100;
        int bet;
        int payout;
        String playAgain;
        String[] row;

        System.out.println("Greetings From Java Slots!");
        System.out.println("Symbols: 🍋 ⭐ 🍒 ⛳ 🍉 ");
        System.out.println("  *******************   ");

        while (balance > 0) {
            System.out.println("Current Balance: R" + balance);
            System.out.print("Enter Bet Amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            if (bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {
                System.out.println("Cant Bet R0");
                continue;
            } else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = SlotsService.spinRow();
            SlotsService.printRow(row);
            payout = SlotsService.getPayout(row, bet);

            if (payout > 0) {
                System.out.println("You won: R" + payout);
                balance += payout;
            } else {
                System.out.println("Spin Again");
            }

            System.out.print("Check Out (Y/N)?: ");
            playAgain = scanner.nextLine().toLowerCase();

            if (playAgain.equals("y")) {
                break;
            }
        }

        System.out.println("Your Final Balance Is R" + balance);
        Thread.sleep(1000);
        System.out.println("GOODBYE");

        scanner.close();
    }
}