import service.UserService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isStudent = false;
        final double basePrice = 119.9;

        System.out.println("Welcome to Flick Lo. \nThe base price for a ticket is R" + basePrice + ".");

        System.out.print("\nWhat is your name?: ");
        String name = scanner.nextLine();

        System.out.print("How old are you?: ");
        int age = scanner.nextInt();
        scanner.nextLine();


        if (UserService.checkAge(age)) {
            System.out.print("Are you a Student? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            isStudent = response.equals("yes");
        }

        double finalPrice = UserService.calculatePrice(age, basePrice, isStudent);

        System.out.printf("\nHello %s\n", name);
        if (finalPrice == 0) {
            System.out.println("You qualify for a free ticket!");
        } else {
            System.out.printf("Your final ticket price is: R%.2f\n", finalPrice);
        }

        scanner.close();
    }
}