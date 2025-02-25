import java.util.Scanner;

public class Substrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");

        email = scanner.nextLine().trim().toLowerCase();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@")+1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("\nEmail must contain @ symbol");
        }

        scanner.close();
    }
}