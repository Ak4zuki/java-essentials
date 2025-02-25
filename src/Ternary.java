import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1 - Convert lbs to kgs");
        System.out.println("2 - Convert kgs to lbs");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        String unit = (choice == 1) ? "lbs" : "kgs";
        System.out.print("Enter weight in " + unit + ":");
        weight = scanner.nextDouble();

        newWeight = (choice == 1) ? (weight * 0.453592) : (weight * 2.20462);

        System.out.println("Converted weight: " + newWeight);

        scanner.close();
    }
}
