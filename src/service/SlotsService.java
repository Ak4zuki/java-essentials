package service;
import java.util.Random;

public class SlotsService {
        public static String[] spinRow() {

            String[] symbols = {"🍋", "⭐", "🍒", "⛳", "🍉"};
            String[] row = new String[3];
            Random random = new Random();

            for (int i = 0; i < 3; i++) {
                row[i] = symbols[random.nextInt(symbols.length)];
            }

            return row;
        }
        public static void printRow(String[] row) {

            System.out.println("************");
            System.out.println(" " + String.join(" | ", row));
            System.out.println("************ ");
        }
        public static int getPayout(String[] row, int bet) {

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
