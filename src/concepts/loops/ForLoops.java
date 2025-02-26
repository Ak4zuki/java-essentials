package concepts.loops;
import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        int start = scanner.nextInt();

        scanner.nextLine();

        System.out.print("What do you want the countdown to say?: ");
        String input = scanner.nextLine();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }

        System.out.println(input);
    }
}