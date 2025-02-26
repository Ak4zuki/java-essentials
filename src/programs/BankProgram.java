package programs;

import java.util.Scanner;

public class BankProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("*****************");
            System.out.println("BANKING PROGRAM");
            System.out.println("*****************");
            System.out.println("1 - Show Balance");
            System.out.println("2 - Deposit");
            System.out.println("3 - Withdraw");
            System.out.println("4 - Exit");
            System.out.println("*****************");

            System.out.print("Enter your choice 1-4: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("SHOW BALANCE");
                    break;
                case 2:
                    System.out.println("DEPOSIT");
                    break;
                case 3:
                    System.out.println("WITHDRAW");
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("INVALID CHOICE");
                    break;
            }
        }
    }
}
