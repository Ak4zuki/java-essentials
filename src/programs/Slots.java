package programs;
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
            row = spinRow();
            printRow(row);
            payout = getPayout(row, bet);

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
    static String[] spinRow() {

        String[] symbols = {"🍋", "⭐", "🍒", "⛳", "🍉"};
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row) {

        System.out.println("************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("************ ");
    }
    static int getPayout(String[] row, int bet) {

        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            int payout;
            switch (row[0]) {
                case "🍋":
                    payout = bet * 10;
                    break;
                case "⭐":
                    payout = bet * 15;
                    break;
                case "🍒":
                    payout = bet * 25;
                    break;
                case "🍉":
                    payout = bet * 50;
                    break;
                case "⛳":
                    payout = bet * 100;
                    break;
                default:
                    payout = 0;
            }
            return payout;
        } else if (row[0].equals(row[1])) {
            int payout;
            switch (row[0]) {
                case "🍋":
                    payout = bet * 2;
                    break;
                case "⭐":
                    payout = bet * 7;
                    break;
                case "🍒":
                    payout = bet * 4;
                    break;
                case "🍉":
                    payout = bet * 3;
                    break;
                case "⛳":
                    payout = bet * 10;
                    break;
                default:
                    payout = 0;
            }
            return payout;
        } else if (row[1].equals(row[2])) {
            int payout;
            switch (row[1]) {
                case "🍋":
                    payout = bet * 2;
                    break;
                case "⭐":
                    payout = bet * 7;
                    break;
                case "🍒":
                    payout = bet * 4;
                    break;
                case "🍉":
                    payout = bet * 3;
                    break;
                case "⛳":
                    payout = bet * 10;
                    break;
                default:
                    payout = 0;
            }
            return payout;
        }
        return 0;
    }
}