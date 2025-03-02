package concepts.oop.inheritance;

import concepts.oop.inheritance.users.PremiumUser;
import concepts.oop.inheritance.users.User;

public class Inheritance {
    public static void main(String[] args) {

        User user = new User("Wj", "wjbos@gmail.com");
        PremiumUser premiumUser = new PremiumUser("Stefan", "svdev@gmail.com", "creditCard");

        user.getMessage();
        premiumUser.getMessage();
    }
}
