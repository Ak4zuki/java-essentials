package concepts.arrays;

public class Varargs {
    public static void main(String[] args) {

        System.out.println("Total: " + add(1, 2, 3, 4, 5, 6));
        System.out.println("Average: " + avg(1, 4, 7, 10));

    }
    static int add(int... numbers){

/**
 * Summary of total numbers
 */

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
    static double avg(double...numbers){

/**
 * Average of total numbers
 */

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for (double number : numbers){
            sum += number;
        }

        return sum / numbers.length;

    }
}
