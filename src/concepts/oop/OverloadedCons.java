package concepts.oop;

import concepts.oop.examples.User;

public class OverloadedCons {
    public static void main(String[] args) {

        User user1 = new User("Stefan");
        User user2 = new User("Wj", "wjbosdev@gmail.com");
        User user3 = new User("Dewald", "salami@gmail.com", 21);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}