package concepts.arrays;
import java.util.Scanner;

public class InputArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] foods;
        int size;

        System.out.print("Number of foods: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter food of choice: ");
            foods[i] = scanner.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}