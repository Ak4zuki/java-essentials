package service;

/**
 * Services for users
 */

public abstract class UserService {

    public static double calculatePrice(int age, double basePrice, boolean isStudent) {
        double finalPrice = basePrice;

        if (age < 13) {
            finalPrice = 0;
        } else if (age <= 50) {
            if (isStudent) {
                finalPrice *= 0.85;
            }
        } else if (age <= 64) {
            finalPrice *= 0.8;
            if (isStudent) {
                finalPrice *= 0.85;
            }
        } else {
            finalPrice *= 0.7;
        }

        return finalPrice;
    }

    public static boolean checkAge(int age) {
        return age >= 16;
    }
}
