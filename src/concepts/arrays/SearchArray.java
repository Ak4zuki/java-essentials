package concepts.arrays;
import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] fruits = {"apple", "orange", "banana", "pineapple"};
        boolean isFound = false;
        String target;

        System.out.print("Enter fruit: ");
        target = scanner.nextLine();


        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not in Array.");
        }

        scanner.close();
    }
}
