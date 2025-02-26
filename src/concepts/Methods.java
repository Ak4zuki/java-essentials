package concepts;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (ageCheck(age)){
            System.out.println("You may sign up");
        }else {
            System.out.println("You must be 18+ to sign up");
        }
    }
    static double square(double number) {return number * number;}
    static double cube(double number) {return number * number * number;}
    static String getFullName(String first, String last) {return first + " " +last; }
    static boolean ageCheck(int age){
        return age >= 18;
    }
}
