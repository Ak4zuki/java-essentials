package concepts.oop.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String print = "Enter a number between 1-10";

        System.out.println(print);

        int userData = getUserData(scanner);

        System.out.println("You Entered " + userData);
    }

    private static int getUserData(Scanner scanner) {
        int data = 0;

        while(true){
            try {
                data = scanner.nextInt();
                if(data < 1 || data > 10){
                    throw new CustomException();
                }
                break;
            } catch (InputMismatchException | CustomException e) {
                System.out.println("INVALID INPUT.");
                System.out.println(e.getMessage());
                scanner.nextLine();
            } finally {
                System.out.println("Ez. Get Gapped");
            }
        }
        return data;
    }
}