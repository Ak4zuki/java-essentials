package concepts.loops;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";

        do{
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }while (name.isEmpty());

        System.out.println("Hello " + name);

        scanner.close();
    }
}
