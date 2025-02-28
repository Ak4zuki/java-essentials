package concepts.oop;


import concepts.oop.examples.Friend;

public class StaticMain {
    public static void main(String[] args) {

        Friend friend1 = new Friend("Wj");
        Friend friend2 = new Friend("Dewald");
        Friend friend3 = new Friend("Tyler");
        Friend friend4 = new Friend("Thomas");
        Friend friend5 = new Friend("Kean");

        Friend.showFriends();

    }
}
