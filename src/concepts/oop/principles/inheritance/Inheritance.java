package concepts.oop.principles.inheritance;

import concepts.oop.principles.inheritance.users.PremiumUser;
import concepts.oop.principles.inheritance.users.User;

public class Inheritance {
    public static void main(String[] args) {

        User user = new User("Wj", "wjbos@gmail.com");
        PremiumUser premiumUser = new PremiumUser("Stefan", "svdev@gmail.com", "creditCard");

        System.out.println(user.getMessage());
        System.out.println(premiumUser.getMessage());
    }
}
