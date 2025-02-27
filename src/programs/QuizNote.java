package programs;
import java.util.Scanner;

public class QuizNote {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] questions = {"\nQuestion 1: \nWhat is the capital of Russia?",
                              "\nQuestion 2: \nWhere is the Great Wall of China located?",
                              "\nQuestion 3: \nWhich is the longest river in the world?",
                              "\nQuestion 4: \nWhat is the largest desert in the world?",
                              "\nQuestion 5: \nWhich country has the most time zones?"};

        String[][] options = {{"1 - Helsinki", "2 - Kyoto", "3 - Moscow", "4 - Novosibirsk"},
                              {"1 - China", "2 - Tokyo", "3 - Hanoi", "4 - Mongolia"},
                              {"1 - Amazon", "2 - Nile", "3 - Yangtze", "4 - Ganges"},
                              {"1 - Sahara Desert", "2 - Arabian Desert", "3 - Kalahari Desert", "4 - Antarctic Desert"},
                              {"1 - Russia", "2 - France", "3 - Canada", "4 - America"}};

        int[] answers = {3, 1, 2, 4, 2};
        int score = 0;
        int guess;

        System.out.println("*******************");
        System.out.println("Welcome to QuizNote");
        System.out.println("*******************");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){
                System.out.println(option);
            }

            System.out.print("Enter your choice: ");
            guess = scanner.nextInt();

            if(guess == answers[i]){
                System.out.println("\n**************");
                System.out.println("   CORRECT!  ");
                System.out.println("**************");
                score++;
            }else{
                System.out.println("\n**************");
                System.out.println("  INCORRECT!  ");
                System.out.println("**************");

            }
        }

        System.out.println("\nFinal score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
