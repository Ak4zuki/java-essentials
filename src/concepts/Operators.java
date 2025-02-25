package concepts;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters long.");
        } else if (username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces or underscores");
        } else{
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}